
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 15646);
		Conta conta3 = new Conta(2112, 45666);
		
		System.out.println(Conta.getTotal());
	}
}
