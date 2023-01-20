
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		
		System.out.println(conta.saque(300));
		
		conta.saque(301);
		System.out.println(conta.getSaldo());
	}
}
