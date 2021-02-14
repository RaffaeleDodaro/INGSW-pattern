package mediator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator m=new ConcreteMediator();
		ConcreteCollegaA cA=new ConcreteCollegaA(m, "Raffaele");
		ConcreteCollegaB cB=new ConcreteCollegaB(m, "Francesco");
		cA.invia("Ciao, come stai? ", "Raffaele");
		cB.invia("Tutto bene, e tu?", "Francesco");
        cA.invia("Tutto bene, si programma!", "Raffaele");
	}

}
