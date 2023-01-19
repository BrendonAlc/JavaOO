
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //Criando objeto
		primeiraConta.saldo  = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("O saldo da primeira conta R$: " + primeiraConta.saldo);
		
		//Criando nova conta
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("O saldo da primeira conta R$: " + segundaConta.saldo);
	}
}
