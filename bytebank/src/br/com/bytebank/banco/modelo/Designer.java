package br.com.bytebank.banco.modelo;

/**
 * Criar polimorfismo da classe Funcionario para bonificacao
 * @author BrendonAlc
 * @version 0.1
 */
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer");
		return 200;
	}
}
