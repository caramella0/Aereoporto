package it.model;

public class Passeggero {

	private String nome;
	private String cognome;
	private int eta;
	private long numeroBiglietto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public long getNumeroBiglietto() {
		return numeroBiglietto;
	}
	public void setNumeroBiglietto(long numeroBiglietto) {
		this.numeroBiglietto = numeroBiglietto;
	}
}
