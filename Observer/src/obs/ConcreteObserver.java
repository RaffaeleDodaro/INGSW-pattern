package obs;

public class ConcreteObserver implements Observer{

	@Override
	public void update() {
		System.out.println("sono "+ this+"sono stato aggiornato");
	}
}	
