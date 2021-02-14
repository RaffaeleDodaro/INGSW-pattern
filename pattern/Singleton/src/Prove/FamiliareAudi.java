package Prove;

import model.Auto;

public class FamiliareAudi extends Auto {

	//creo l'auto usando la singola istanza di auto
	private Auto a = Auto.getAuto();

	public Auto creoFamiliareAudi() {
		a.setMarca("audi");
		a.setModello("a4");
		a.setTipologia("familiare");
		a.setCavalli(190);
		return a;
	}
}
