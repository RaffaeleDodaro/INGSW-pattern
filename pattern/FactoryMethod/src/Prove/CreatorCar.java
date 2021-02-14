package Prove;

import model.Auto;

public class CreatorCar {

    public static Auto getCar(String marca, String tipologia)
    {
        Auto car=null;
        switch(marca)
        {
            case "fiat":
                car = Fiat.CreoFiat(tipologia);
                break;
            case "audi":
                car = Audi.CreoAudi(tipologia);
                break;
        }
        return car;
    }
}
