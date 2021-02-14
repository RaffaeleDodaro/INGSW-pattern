package bridge;

abstract class Dispositivo {
	protected TelecomandoAvanzato ta1;
	protected TelecomandoAvanzato ta2;

	protected Dispositivo(TelecomandoAvanzato ta1, TelecomandoAvanzato ta2) {
		this.ta1 = ta1;
		this.ta2 = ta2;
	}

	abstract public void azione();
}
