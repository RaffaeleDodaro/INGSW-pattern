package Prove;

import model.Auto;

public class Audi extends Auto {

    private static Audi a=new Audi();

    public static Audi CreoAudi(String tipologia)
    {
        switch (tipologia)
        {
            case "familiare":
                a = costruiscoFamiliare();
                break;
            case "sportiva":
                a = costruiscoSportiva();
                break;
        }
        return a;
    }

    public static Audi costruiscoFamiliare()
    {
        a.setMarca("audi");
        a.setModello("a4");
        a.setTipologia("familiare");
        a.setCavalli(100);
        return a;
    }

    public static Audi costruiscoSportiva()
    {
        a.setMarca("audi");
        a.setModello("r8");
        a.setTipologia("sportiva");
        a.setCavalli(200);
        return a;
    }
}
