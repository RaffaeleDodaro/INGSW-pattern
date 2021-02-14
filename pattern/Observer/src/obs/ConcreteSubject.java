package obs;

public class ConcreteSubject extends Subject{
	private boolean state;
	
	public void setState(boolean state)
	{
		this.state=state;
		notifyObserver();
	}
	
	public boolean getState()
	{
		return this.state;
	}
}
