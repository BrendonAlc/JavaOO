public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	
	//sintaxe do método -- void nomeDoMetodo(tipo valor)
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
}