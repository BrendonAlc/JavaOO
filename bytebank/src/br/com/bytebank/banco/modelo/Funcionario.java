package br.com.bytebank.banco.modelo;

/**
 * Classe Funcionarios abstrata, nao pode instanciar desta classe
 * @author BrendonAlc
 *
 */

public abstract class Funcionario { 
	
	private String nome;
	private String cpf;
	protected double salario; //protected para ficar publico as classes filho
	
	/**
	 * Método abstrato, pois não existe uma bonificacao padrão para os funcionarios
	 * @return
	 * 
	 */
	//metodo sem implementacao
	public abstract double getBonificacao(); //
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
