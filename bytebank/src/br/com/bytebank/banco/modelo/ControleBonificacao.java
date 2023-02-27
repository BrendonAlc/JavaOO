package br.com.bytebank.banco.modelo;

public class ControleBonificacao {
	
	private double soma;
	
	/**
	 * 
	 * @param f
	 */
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();	
		this.soma = this.soma + boni;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getSoma() {
		return soma;
	}
}
