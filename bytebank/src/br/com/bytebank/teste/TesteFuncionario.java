package br.com.bytebank.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente brendon = new Gerente();
		brendon.setNome("Brendon Alcantara");
		brendon.setCpf("222.222.222.47");
		brendon.setSalario(2500.50);
		
		System.out.println(brendon.getNome());
		System.out.println(brendon.getBonificacao());
	}
}
