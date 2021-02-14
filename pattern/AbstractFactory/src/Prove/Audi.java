package Prove;

import model.Auto;

public class Audi extends AbstractCreatorCar {

    public Audi(String tipologia)
    {
        createAuto(tipologia);
    }

    @Override
    public Auto createAuto(String tipologia) {
        switch (tipologia)
        {
            case "familiare":
                return new FamiliareAudi().creoFamiliareAudi();
            case "sportiva":
                return new SportivaAudi().creoSportivaAudi();
        }
        return null;
    }
}
