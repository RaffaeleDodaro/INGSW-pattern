package decorator;


//implementa l'interfaccia decorator al fine di aggiungere nuove funzionalità all'oggetto
public class ConcreteDecorator implements Decoratore {

	Component m = null;

	public ConcreteDecorator(Component m) {
		// TODO Auto-generated constructor stub
		this.m = m;
	}

	@Override
	public void operation() {
		System.out.println("first logging");
		m.operation();
		System.out.println("last loging");
	}

}
