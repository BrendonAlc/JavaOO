package br.com.bytebank.banco.modelo;

public class SistemaInterno {
	
	private int senha = 2222;
	
	/**
	 * 
	 * @param fa
	 */
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou) {
			System.out.println("Login efetuado com sucesso!");
		} else {
			System.out.println("Senha incorreta, digite novamente a senha!");
		}
	}
}
