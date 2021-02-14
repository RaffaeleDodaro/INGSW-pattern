package concreteVisitor;

import element.Rettangolo;
import visitor.Visitor;


//implementa il metodo visit e definisce l'algoritmo da applicare
//per l'element passato
public class VisitorRettangoloPerimetro extends Visitor {

	@Override
	public void visitRettangoloArea(Rettangolo e) {}

	@Override
	public void visitRettangoloPerimetro(Rettangolo e) {
		int perimentro = (e.getAltezza() + e.getLarghezza()) * 2;
		System.out.println("Il perimetro del rettangolo e': " + perimentro);
	}

}
