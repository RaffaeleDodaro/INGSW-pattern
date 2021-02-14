package Prove;

import model.Auto;

public class FamiliareFiat extends Auto {

    private Auto a = new Auto();

    public FamiliareFiat() {
        creoFamiliareFiat();
    }

    public Auto creoFamiliareFiat() {
        a.setMarca("fiat");
        a.setModello("tipo");
        a.setTipologia("familiare");
        a.setCavalli(100);
        return a;
    }
}
