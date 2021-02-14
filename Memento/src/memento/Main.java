package memento;

public class Main {

	public static void main(String[] args) {
		CareTaker c = new CareTaker();

		Originator orig = new Originator();
		orig.setOriginatorState("x");
		c.mementoList.add(orig.createMemento());
		System.out.println("stato originator: " + orig.getOriginatorState());

		orig.setOriginatorState("z");
		c.mementoList.add(orig.createMemento());
		System.out.println("\nstato originator: " + orig.getOriginatorState());

		c.mementoList.remove(c.mementoList.size() - 1);//rimuove lo stato attuale
		orig.restoreMemento(c.mementoList.remove(c.mementoList.size() - 1));//ripristino il vecchio stato
		System.out.println("\nstato originator: " + orig.getOriginatorState());
	}
}