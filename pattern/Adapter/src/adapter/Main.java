package adapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Auto auto=new Auto();
			Moto moto=new Moto();
			Veicolo2 vAdapter=new VeicoloAdapter(auto);
			
			System.out.println("auto");
			auto.numeroRuote();
			System.out.println("moto");
			moto.sterzo();
	}

}
