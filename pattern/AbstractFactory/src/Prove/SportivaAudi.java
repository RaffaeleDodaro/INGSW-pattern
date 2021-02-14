package Prove;

import model.Auto;

public class SportivaAudi extends Auto {
    public SportivaAudi() {
        creoSportivaAudi();
    }

    private Auto a = new Auto();

    public Auto creoSportivaAudi() {
        a.setMarca("audi");
        a.setModello("r8");
        a.setTipologia("sportiva");
        a.setCavalli(100);
        return a;
    }
}
