
public class CalculadorDeImposto {

	private double totalImposto;
	
	//método para receber interface Tributavel
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
