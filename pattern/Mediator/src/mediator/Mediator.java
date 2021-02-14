package mediator;

//classe su cui le sottoclassi fanno riferimento
public abstract class Mediator {
	public abstract void aggiungi(Collega c);
	public abstract void inviaRicevi(String nomeMit,String mes, String nomeDest);
}