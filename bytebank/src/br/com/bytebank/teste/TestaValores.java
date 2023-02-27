package br.com.bytebank.teste;

import br.com.bytebank.banco.modelo.*;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1337, 24226);
		
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new ContaCorrente(1337, 15646);
		Conta conta3 = new ContaCorrente(2112, 45666);
		
		System.out.println(Conta.getTotal());
	}
}
