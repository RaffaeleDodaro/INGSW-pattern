package visitor;

import element.Rettangolo;

//dichiara un metodo visit per ogni element
//il nome del metodo ed il parametro identificano la classe Element
//che ha effettuato l'invocazione

public abstract class Visitor {
	public abstract void visitRettangoloArea(Rettangolo e);
	public abstract void visitRettangoloPerimetro(Rettangolo e);
}
