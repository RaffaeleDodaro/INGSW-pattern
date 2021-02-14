package Prove;

import model.Auto;

public abstract class CreatorCar {

	public static CreatorCar setCar(String marca, String tipologia) {
		switch (marca) {
		case "fiat":
			return new Fiat(tipologia);
		case "audi":
			return new Audi(tipologia);
		}
		return null;
	}

	public abstract Auto createAuto(String tipologia);
}
