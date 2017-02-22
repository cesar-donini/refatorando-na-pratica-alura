package br.alura.refatoracao.cap4;

public class ContaPF extends Conta {

	private static double taxaDeJuros = 0.1;

	public ContaPF(String titular, double saldoInicial) {
		super(titular, saldoInicial, taxaDeJuros);
	}
	
}
