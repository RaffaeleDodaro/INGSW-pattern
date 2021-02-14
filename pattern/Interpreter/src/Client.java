import java.util.EmptyStackException;

import javax.swing.*;

public class Client {
	public static void main(String[] args) {

		String exp = (String) JOptionPane.showInputDialog(null, "insert expression");
		Context c = new Context(exp);
		int r = 0;
		
		//fino a quando ho elementi in coda...
		while (true) {
			try {
				Expression e = c.getOperator();
				r = e.interpreter(c);
			} catch (EmptyStackException e) {
				break;
			}
		}

		JOptionPane.showMessageDialog(null, "result: " + r);

		/*
		 * c.push(new Number(n1));
		 * 
		 * switch(o){ case "+": Expression add=new Sum();
		 * JOptionPane.showMessageDialog(null, "result: "+add.interpreter(c)); break;
		 * case "*": Expression mul=new Mul(); JOptionPane.showMessageDialog(null,
		 * "result: "+ mul.interpreter(c)); break; case "-": Expression sub=new Sub();
		 * JOptionPane.showMessageDialog(null, "result: "+ sub.interpreter(c)); break;
		 * case "/": Expression div=new Div(); JOptionPane.showMessageDialog(null,
		 * "result: "+ div.interpreter(c)); break; default: return; }
		 */
	}
}
