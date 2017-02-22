package br.alura.refatoracao.cap4;

public abstract class Conta {

	private String titular;
	private double saldo;
	private double taxaDeJuros; 
	
	public Conta(String titular, double saldo, double taxaDeJuros) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.taxaDeJuros = taxaDeJuros;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void saca(double valor) {
		saldo -= valor + taxaDeJuros;
	}
	
	public void deposita(double valor) {
		saldo += valor - taxaDeJuros;
	}
}
