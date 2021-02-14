package lettere;

public class Draw {
	
	private LetteraA a;
	private LetteraB b;
	private LetteraC c;
	public void start() {
		a.draw();
		b.draw();
		c.draw();
	}
	public Draw() {
		a = new LetteraA();
		b = new LetteraB();
		c = new LetteraC();
	}
}
