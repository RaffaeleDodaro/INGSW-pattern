package Prove;
import model.Auto;

public class Fiat extends Auto {

    private static Fiat a = new Fiat();

    public static Fiat CreoFiat(String tipologia)
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

    public static Fiat costruiscoFamiliare()
    {
        a.setMarca("fiat");
        a.setModello("tipo");
        a.setTipologia("familiare");
        a.setCavalli(100);
        return a;
    }

    public static Fiat costruiscoSportiva()
    {
        a.setMarca("fiat");
        a.setModello("124");
        a.setTipologia("sportiva");
        a.setCavalli(150);
        return a;
    }
}
