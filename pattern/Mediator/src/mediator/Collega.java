package mediator;

//definisce la classe astratta dei colleghi
public abstract class Collega {

	public abstract void invia(String mes, String nomeDest);

	public abstract String getNome();

	public abstract void ricevi(String mes, String nomeMit);
}
