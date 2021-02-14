package Prove;

import model.Auto;

public class SportivaFiat extends Auto {
	private Auto a = Auto.getAuto();

	public Auto creoSportivaFiat() {
		a.setMarca("fiat");
		a.setModello("124");
		a.setTipologia("sportiva");
		a.setCavalli(140);
		return a;
	}
}
