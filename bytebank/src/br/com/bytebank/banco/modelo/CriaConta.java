package br.com.bytebank.banco.modelo;

/**
 * 
 * @author BrendonAlc
 * @version 0.1
 */
public class CriaConta {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Conta primeiraConta = new ContaCorrente(1337, 24226); //Criando objeto
		try {
			primeiraConta.deposita(200);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.getSaldo();
		System.out.println("O saldo da primeira conta R$: " + primeiraConta.getSaldo());
		
		//Criando nova conta
		Conta segundaConta = new ContaCorrente(1337, 24226);
		try {
			segundaConta.deposita(50);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("O saldo da primeira conta R$: " + segundaConta.getSaldo());
	}
}
