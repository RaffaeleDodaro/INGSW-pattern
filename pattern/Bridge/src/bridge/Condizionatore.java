package bridge;
public class Condizionatore extends Dispositivo{

	public Condizionatore(TelecomandoAvanzato ta1, TelecomandoAvanzato ta2) {
		super(ta1,ta2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void azione() {
		// TODO Auto-generated method stub
		System.out.println("sono il condizionatore");
		ta1.mandaAzione();
		ta2.mandaAzione();
	}
}