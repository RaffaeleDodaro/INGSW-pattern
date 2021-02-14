package memento;

//accede allo stato precedente dell'oggetto da ripristinare
public class Originator {

	private Object originatorState;

	public Object getOriginatorState() {
		return originatorState;
	}

	public void setOriginatorState(Object state) {
		this.originatorState = state;
	}

	public Memento createMemento() {
		Memento memento = new Memento();
		memento.setMementoState(originatorState);
		return memento;
	}

	public void restoreMemento(Memento memento) {
		originatorState = memento.getMementoState();
	}
}
