package element;

import concreteVisitor.VisitorRettangoloArea;
import concreteVisitor.VisitorRettangoloPerimetro;
import visitor.Visitor;

//definisce il metodo accept che prende come argomento un visitor
//e mantiene set e get dell'elemento
public class Rettangolo {
	private int altezza;
	private int larghezza;
	
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	public int getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}
	
	public void accept(Visitor v) {
		if(v instanceof VisitorRettangoloArea)
			v.visitRettangoloArea(this);
		else if(v instanceof VisitorRettangoloPerimetro)
			v.visitRettangoloPerimetro(this);
	}
}
