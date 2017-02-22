package br.alura.refatoracao.cap6;

public enum Moeda {

	DOLAR(2.7),
	EURO(3.7);
	
	private double valorTaxa;
	
	private Moeda(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	
	public double getValorTaxa() {
		return valorTaxa;
	}	
}
