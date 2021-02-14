package concreteVisitor;

import element.Rettangolo;
import visitor.Visitor;


//implementa il metodo visit e definisce l'algoritmo da applicare
//per l'element passato
public class VisitorRettangoloArea extends Visitor{

	@Override
	public void visitRettangoloArea(Rettangolo e) {
		int aria=e.getAltezza()*e.getLarghezza();
		System.out.println("Area rett: " + aria);
	}

	@Override
	public void visitRettangoloPerimetro(Rettangolo e) {}
}
