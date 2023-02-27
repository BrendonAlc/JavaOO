package br.com.bytebank.banco.modelo;

/**
 * 
 * @author BrendonAlc
 *
 */

//br.com.bytebank.banco.modelo.Administrador => FQN (full qualify name)
public class Administrador extends Funcionario implements Autenticavel{
	
	
	private AutenticacaoUtil autenticador;

	@Override
	public double getBonificacao() {
		return 50;
	}
	
	public Administrador() {
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
