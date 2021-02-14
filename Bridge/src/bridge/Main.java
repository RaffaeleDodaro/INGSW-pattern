package bridge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dispositivo d1= new Televisore(new Accendi(),new Spegni());
		d1.azione();
		System.out.println();
		Dispositivo d2= new Condizionatore(new Accendi(),new Spegni());
		d2.azione();
	}

}
