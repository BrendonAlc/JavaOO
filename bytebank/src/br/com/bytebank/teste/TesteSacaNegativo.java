package br.com.bytebank.teste;

import br.com.bytebank.banco.modelo.*;

//Teste utilizando assinatura para testar SaldoInsuficienteException
public class TesteSacaNegativo {
	public static void main(String[] args) throws SaldoInsuficienteException {
		Conta conta = new ContaCorrente(1337, 24226);
		

			conta.deposita(200);

		try {
			conta.saque(300.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());
	}
}
