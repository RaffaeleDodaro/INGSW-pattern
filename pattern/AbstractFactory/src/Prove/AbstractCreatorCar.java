package Prove;

import model.Auto;

public abstract class AbstractCreatorCar{

    public static AbstractCreatorCar getCar(String marca, String tipologia)
    {
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
