
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoBrendon = new Conta();
		contaDoBrendon.saldo = 100;
		contaDoBrendon.deposita(50);
		
		System.out.println("valor de saldo da conta é: " + contaDoBrendon.saldo);
	}
}
