public abstract class Conta {
	protected double saldo = 100;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	//Constructor
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta: " + this.numero);
	}
	
	
	//sintaxe do método -- void nomeDoMetodo(tipo valor)
	public abstract void deposita(double valor);
	
	//método de para saque
	public void saque (double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo " + this.saldo + ", Valor R$ " + this.valor);
		}
		this.saldo -=  valor;
	}
	
	//método tranfere
	public void tranfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saque(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Valor não pode ser menor que 0");
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menos ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	
}