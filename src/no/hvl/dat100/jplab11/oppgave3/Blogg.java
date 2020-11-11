package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	Innlegg[] innleggTabell;
	int nesteLedig;

	public Blogg() {
		innleggTabell = new Innlegg[20];

	}

	public Blogg(int lengde) {
		innleggTabell = new Innlegg[lengde];
	}

	public int getAntall() {

		int i = 0;
		Boolean antFunnet = false;
		while (!antFunnet) {
			if (innleggTabell[i] == null) {
				antFunnet = true;

			} else
				i++;
		}
		nesteLedig=i;
		return i;

	}

	public Innlegg[] getSamling() {
		return innleggTabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < getAntall(); i++) {
			if (innlegg.erLik(innleggTabell[i])) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {

		for (int i = 0; i < getAntall(); i++) {
			if (innlegg.erLik(innleggTabell[i])) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {

		for (int i = 0; i < innleggTabell.length; i++) {
			if (innleggTabell[i] == null) {
				return true;
			}
		}
		return false;
	}

	public boolean leggTil(Innlegg innlegg) {
		

		if (!finnes(innlegg) && getAntall() < innleggTabell.length) {
			innleggTabell[nesteLedig++] = innlegg;
			
			return true;
			
		}

		return false;
	}

	public String toString() {
		String svar = getAntall() + "\n";
		

		for (int i = 0; i < getAntall(); i++) {

			svar += innleggTabell[i].toString();

		}
		return svar;
		
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}