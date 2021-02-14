package Prove;

import model.Auto;

public class SportivaFiat extends Auto {

    private Auto a = new Auto();

    public SportivaFiat() {
        creoSportivaFiat();
    }

    public Auto creoSportivaFiat() {
        a.setMarca("fiat");
        a.setModello("124");
        a.setTipologia("sportiva");
        a.setCavalli(100);
        return a;
    }
}
