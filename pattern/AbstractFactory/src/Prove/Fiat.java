package Prove;
import model.Auto;

public class Fiat extends AbstractCreatorCar{ //Auto {

    public Fiat(String tipologia)
    {
        createAuto(tipologia);
    }

    @Override
    public Auto createAuto(String tipologia) {
        switch (tipologia)
        {
            case "familiare":
                return new FamiliareFiat().creoFamiliareFiat();
            case "sportiva":
                return new SportivaFiat().creoSportivaFiat();
        }
        return null;
    }
//    public Auto CreoFiat(String tipologia)
//    {
////        switch (tipologia)
////        {
////            case "familiare":
////                return new FamiliareFiat();
////                break;
////            case "sportiva":
////                return new SportivaFiat();
////                break;
////        }
////        return null;
//    }


//
//    private static Fiat a = new Fiat();
//
//    public static Fiat CreoFiat(String tipologia)
//    {
//        switch (tipologia)
//        {
//            case "familiare":
//                a = costruiscoFamiliare();
//                break;
//            case "sportiva":
//                a = costruiscoSportiva();
//                break;
//        }
//        return a;
//    }
//
//    public static Fiat costruiscoFamiliare()
//    {
//        a.setMarca("fiat");
//        a.setModello("tipo");
//        a.setTipologia("familiare");
//        a.setCavalli(100);
//        return a;
//    }
//
//    public static Fiat costruiscoSportiva()
//    {
//        a.setMarca("fiat");
//        a.setModello("124");
//        a.setTipologia("sportiva");
//        a.setCavalli(150);
//        return a;
//    }
}
