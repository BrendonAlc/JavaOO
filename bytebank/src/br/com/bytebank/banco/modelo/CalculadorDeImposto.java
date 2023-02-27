package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {

	private double totalImposto;
	
	/**
	 * método para receber interface Tributavel
	 * @param t
	 */
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getTotalImposto() {
		return totalImposto;
	}
}
