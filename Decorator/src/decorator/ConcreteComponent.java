package decorator;

//definisce un oggeto al quale verrà aggiunta una nuova funzionalità
public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}

}
