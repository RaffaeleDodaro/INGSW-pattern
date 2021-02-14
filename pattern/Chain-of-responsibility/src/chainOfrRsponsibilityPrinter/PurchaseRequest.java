package chainOfrRsponsibilityPrinter;

//mi serve per capire il tipo di stampa che il client mi ha richiesto
public class PurchaseRequest {
    private String tipoStampa;
    
    public PurchaseRequest(String tipoStampa) {
    	this.tipoStampa=tipoStampa;
    }

    public String getTipoStampa() {
        return tipoStampa;
    }
}
