package mediator;

import java.util.ArrayList;
import java.util.List;

//mantiene una lista di colleghi e implementa 
//lo scambio di messaggi tra loro
public class ConcreteMediator extends Mediator {

	private ArrayList<Collega> listaDiColleghi = new ArrayList<Collega>();

	@Override
	public void aggiungi(Collega c) {
		listaDiColleghi.add(c);
	}

	@Override
	public void inviaRicevi(String nomeMit, String mes, String nomeDest) {
		for (Collega c : listaDiColleghi)
			if (c.getNome().equals(nomeDest))
				c.ricevi(mes, nomeMit);

	}
}
