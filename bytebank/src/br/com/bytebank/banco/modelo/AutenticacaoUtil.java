package br.com.bytebank.banco.modelo;

/**
 * 
 * @author BrendonAlc
 *
 */
public class AutenticacaoUtil {
	
	private int senha;
	
	/**
	 * 
	 * @param senha
	 */
	public void setSenha(int senha) {
		this.senha = senha;
	}

	/**
	 * 
	 * @param senha
	 * @return
	 */
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;	
		}
	}
}
