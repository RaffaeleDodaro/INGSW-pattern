package client;

import concreteVisitor.VisitorRettangoloArea;
import concreteVisitor.VisitorRettangoloPerimetro;
import element.Rettangolo;

public class Main {
	public static void main(String[] args) {
		Rettangolo e = new Rettangolo();
		e.setAltezza(100);
		e.setLarghezza(200);
		e.accept(new VisitorRettangoloArea());
		e.accept(new VisitorRettangoloPerimetro());
	}
}