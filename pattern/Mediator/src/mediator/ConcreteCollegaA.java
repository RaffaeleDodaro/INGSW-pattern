package mediator;

//implementa il singolo collega e le modalità di comunicazione
//con il mediatore

public class ConcreteCollegaA extends Collega {
	private String nome;
	private Mediator m;

	public ConcreteCollegaA(Mediator m, String nome) {
		this.nome = nome;
		this.m = m;
		this.m.aggiungi(this);
	}

	@Override
	public void invia(String mes, String nomeDest) {
		m.inviaRicevi(nome, mes, nomeDest);
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public void ricevi(String mes, String nomeMit) {
		System.out.println(nomeMit + " -> " + nome + ": " + mes);
	}
}
