package Prove;

import model.Auto;

public class Fiat extends CreatorCar {

	public Fiat(String tipologia) {
		createAuto(tipologia);
	}

	@Override
	public Auto createAuto(String tipologia) {
		switch (tipologia) {
		case "familiare":
			return new FamiliareFiat().creoFamiliareFiat();
		case "sportiva":
			return new SportivaFiat().creoSportivaFiat();
		}
		return null;
	}
}
