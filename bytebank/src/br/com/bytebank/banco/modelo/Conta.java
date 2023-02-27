package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta.
 * 
 * @author BrendonAlc
 * @version 0.1
 */
public abstract class Conta {
	protected double saldo = 100;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero.
	 * @param agencia
	 * @param numero
	 */

	
	public Conta(int agencia, int numero) {
		Conta.total++;
		if (agencia < 1) {
			throw new IllegalArgumentException("Agência inválida");
		}
		
		if (numero < 1) {
			throw new IllegalArgumentException("Número da conta inválido");
		}
		
		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta: " + this.numero);
	}
	
	/**
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	//sintaxe do método -- void nomeDoMetodo(tipo valor)
	public abstract void deposita(double valor) throws SaldoInsuficienteException;
	
	/**
	 * Valor precisa ser maior que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	//método de para saque com assinatura de método exception SaldoInsuficiente
	public void saque (double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo " + this.saldo + ", Valor R$ " + valor);
		}
		this.saldo -=  valor;
	}
	
	/**
	 * 
	 * @param valor
	 * @param destino
	 * @throws SaldoInsuficienteException
	 */
	
	//método transfere com assinatura de método exception SaldoInsuficiente
	public void tranfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saque(valor);
		destino.deposita(valor);
	}
	
	/**
	 * 
	 * @return
	 */
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