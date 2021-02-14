package Prove;

import model.Auto;

public class SportivaAudi extends Auto {
	private Auto a = Auto.getAuto();

	public Auto creoSportivaAudi() {
		a.setMarca("audi");
		a.setModello("r8");
		a.setTipologia("sportiva");
		a.setCavalli(540);
		return a;
	}
}
