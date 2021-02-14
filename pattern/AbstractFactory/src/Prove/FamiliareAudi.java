package Prove;

import model.Auto;

public class FamiliareAudi extends Auto {

    private Auto a = new Auto();

    public FamiliareAudi() {
        creoFamiliareAudi();
    }

    public Auto creoFamiliareAudi() {
        a.setMarca("audi");
        a.setModello("a4");
        a.setTipologia("familiare");
        a.setCavalli(100);
        return a;
    }
}
