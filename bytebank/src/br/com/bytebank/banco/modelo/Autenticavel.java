package br.com.bytebank.banco.modelo;

/**
 * contrato Autenticavel, quem assinar este contrato, precisa implementar, método setSenha e método autentica.
 * @author BrendonAlc
 *
 */

//Interface abstrata intermediaria de funcionário para que somente funcionarios autenticaveis tenham senha de acesso.
public abstract interface Autenticavel{
	
	/**
	 * 
	 * @param senha
	 */
	public abstract void setSenha(int senha);
	
	/**
	 * 
	 * @param senha
	 * @return
	 */
	//método de autenticação de senha em boleano
	public abstract boolean autentica(int senha);
}
