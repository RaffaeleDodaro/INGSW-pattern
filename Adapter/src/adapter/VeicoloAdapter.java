package adapter;

public class VeicoloAdapter implements Veicolo2 {

	Auto auto;
	public VeicoloAdapter(Auto a)
	{
		this.auto=a;
	}
	
	@Override
	public void sterzo() {
		auto.numeroRuote();
	}

}
