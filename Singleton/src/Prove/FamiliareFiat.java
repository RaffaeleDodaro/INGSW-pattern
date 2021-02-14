package Prove;

import model.Auto;

public class FamiliareFiat extends Auto {

	private Auto a = Auto.getAuto();
	
	public Auto creoFamiliareFiat() {
		a.setMarca("fiat");
		a.setModello("tipo");
		a.setTipologia("familiare");
		a.setCavalli(95);
		return a;
	}
}
