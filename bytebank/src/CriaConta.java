
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1337, 24226); //Criando objeto
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.getSaldo();
		System.out.println("O saldo da primeira conta R$: " + primeiraConta.getSaldo());
		
		//Criando nova conta
		Conta segundaConta = new Conta(1337, 24226);
		segundaConta.deposita(50);
		System.out.println("O saldo da primeira conta R$: " + segundaConta.getSaldo());
	}
}
