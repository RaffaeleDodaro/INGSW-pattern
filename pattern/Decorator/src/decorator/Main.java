package decorator;

public class Main {
//client che effettua l'invocazione alla funzionalità di interesse
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component m=new ConcreteDecorator(new ConcreteComponent());
		m.operation();
	}

}
