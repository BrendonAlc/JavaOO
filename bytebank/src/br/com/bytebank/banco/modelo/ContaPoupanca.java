package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
}
