import java.util.Stack;

//context gestisce l'operazione corretta da scegliere in base all'operatore
public class Context {
	private Stack stackNumber = null;
	private Stack stackOperator = null;

	public Context(String exp) {
		this.stackNumber = new Stack();
		this.stackOperator = new Stack();

		String[] l = exp.split(" ");

		for (String t : l){
			if (t.equals("+"))
				stackOperator.add(new Sum());
			else if (t.equals("*"))
				stackOperator.add(new Mul());
			else
				stackNumber.add(new Number(t));
		}
	}

	//ottengo il numero su cui fare operazioni
	public Expression getNumber() {
		return (Expression) stackNumber.pop();
	}
	
	public Expression getOperator() {
		return (Expression) stackOperator.pop();
	}
	
	//aggiungo il risultato momentaneo dell'operazione
	public void setNumber(Expression exp) {
		stackNumber.push(exp);
	}

}
