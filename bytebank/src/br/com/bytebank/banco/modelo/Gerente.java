package br.com.bytebank.banco.modelo;

//Gerente é um Funcionario e deverá herda atributos da Classe Funcionario para não duplicar código, assina o contrato Autenticavel, é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	//Bonificação de salario do Gerente é 1 salário utilizando variavel da superClass
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
	}
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	//Autenticação da senha, delegando a chamada para o método util criando para chamar a classe AutenticacaoUtil
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
