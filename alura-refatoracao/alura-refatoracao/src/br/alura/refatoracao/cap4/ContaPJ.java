package br.alura.refatoracao.cap4;

public class ContaPJ extends Conta {

	private static double taxaDeJuros = 0.2;
	
	public ContaPJ(String titular, double saldoInicial) {
		super(titular, saldoInicial, taxaDeJuros);
	}
}
