package obs;

public class Main {

	public static void main(String[] args) {
		ConcreteSubject s=new ConcreteSubject();
		Observer obs1=new ConcreteObserver();
		Observer obs2=new ConcreteObserver();
		s.addObserver(obs1);
		s.addObserver(obs2);
		s.setState(true);
		s.removeObserver(obs1);
		s.setState(false);
	}

}
