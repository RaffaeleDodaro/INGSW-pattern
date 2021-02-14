package memento;

public class Memento {
	// questa classe si occupa di detenere lo stato dell'originator
	// e consente solo a questi di accedervi

	private Object mementoState;

	public Object getMementoState() {
		return this.mementoState;
	}

	public void setMementoState(Object originatorState) {
		this.mementoState = originatorState;
	}
}
