
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoBrendon = new ContaCorrente(1337, 24226);
		contaDoBrendon.getSaldo();
		contaDoBrendon.deposita(50);
		System.out.println("valor de saldo da conta é: " + contaDoBrendon.getSaldo());
		
		boolean conseguiuRetirar = contaDoBrendon.saque(20);
		System.out.println("O saldo de sua conta é: R$ " + contaDoBrendon.getSaldo());
		System.out.println(conseguiuRetirar);
		
		//Nova conta
		Conta contaDaLuciana = new ContaCorrente(1337, 24226);
		contaDaLuciana.deposita(600);
		
		//Teste de tranferencia
		
		boolean sucessoTransferencia = (contaDaLuciana.tranfere(200, contaDoBrendon));
		if(sucessoTransferencia) {
			System.out.println("Transferência com sucesso!");
		} else {
			System.out.println("Saldo insuficiente, favor verificar seu saldo!");
		}
		System.out.println("Saldo da conta da Luciana R$ " + contaDaLuciana.getSaldo());
		System.out.println("Saldo da conta do Brendon R$ " + contaDoBrendon.getSaldo());
	}
}
