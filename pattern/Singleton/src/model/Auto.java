package model;

public class Auto {
	private String marca;
	private String modello;
	private String tipologia;
	private int cavalli;

	// classe singleton

	private static Auto a = null;

	public static Auto getAuto() {
		if (a == null)
			a = new Auto();
		return a;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public int getCavalli() {
		return cavalli;
	}

	public void setCavalli(int cavalli) {
		this.cavalli = cavalli;
	}
}
