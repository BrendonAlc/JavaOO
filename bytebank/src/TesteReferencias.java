
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		System.out.println("**Realizando teste com as primeiras referências**");
		Conta primeiraConta = new Conta(1337, 24226);
		primeiraConta.getSaldo();
		System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
		
		segundaConta.deposita(100);
		System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta.getSaldo());
		
		if(primeiraConta == segundaConta) {
			System.out.println("É a mesma conta!");
		}
		else {
			System.out.println("São constas distintas!");
		}
		System.out.println();
		
		
		//Associando Cliente com dados da conta
		System.out.println("----Populando cliente do banco----");
		Cliente brendon = new Cliente();
		brendon.setNome("Brendon");
		brendon.setCpf("222.222.222-41");
		brendon.setProfissao("Programador");
		
		Conta contaDoBrendon = new Conta(1337, 24226);
		contaDoBrendon.deposita(100);
		
		contaDoBrendon.setTitular(brendon);
		System.out.println("Nome do titular da conta: " + contaDoBrendon.getTitular().getNome());
		//System.out.println(contaDoBrendon.titular);//teste de retorno do titular
		System.out.println("Cpf do titular da conta é: " + contaDoBrendon.getTitular().getCpf());
		System.out.println("Profissão do cliente é: " + contaDoBrendon.getTitular().getProfissao());
	}
}
