package bridge;

public class Televisore extends Dispositivo{

	public Televisore(TelecomandoAvanzato ta1, TelecomandoAvanzato ta2) {
		super(ta1,ta2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void azione() {
		System.out.println("sono il televisore");
		ta1.mandaAzione();
		ta2.mandaAzione();
	}
}
