public class Conta {
	private double saldo = 100;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	
	//sintaxe do método -- void nomeDoMetodo(tipo valor)
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	//método de para saque
	public boolean saque (double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	//método tranfere
	public boolean tranfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
}