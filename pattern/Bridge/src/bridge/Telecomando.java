package bridge;

public class Telecomando extends Dispositivo{

	protected Telecomando(TelecomandoAvanzato ta1, TelecomandoAvanzato ta2) {
		super(ta1,ta2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void azione() {
		// TODO Auto-generated method stub
		System.out.println("ho acceso la tv");
	}
	
	
}
