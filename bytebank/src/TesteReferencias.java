
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		System.out.println("**Realizando teste com as primeiras referências**");
		Conta primeiraConta = new ContaCorrente(1337, 24226);
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
		
		Conta contaDoBrendon = new ContaCorrente(1337, 24226);
		contaDoBrendon.deposita(100);
		
		contaDoBrendon.setTitular(brendon);
		System.out.println("Nome do titular da conta: " + contaDoBrendon.getTitular().getNome());
		//System.out.println(contaDoBrendon.titular);//teste de retorno do titular
		System.out.println("Cpf do titular da conta é: " + contaDoBrendon.getTitular().getCpf());
		System.out.println("Profissão do cliente é: " + contaDoBrendon.getTitular().getProfissao());
		System.out.println();
		
		System.out.println("Teste de controle de bonificação");
		
		Gerente g1 = new Gerente();
		g1.setNome("Juninho");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
		
		System.out.println();
		System.out.println("Teste com tipos de conta.");
		System.out.println();
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.tranfere(10.0, cp);
		System.out.println("O saldo da CC é R$ " + cc.getSaldo());
		System.out.println("O saldo da CP é R$ " + cp.getSaldo());
		System.out.println();
		System.out.println();
		
		System.out.println("---Teste da classe SistemaInterno---");
		System.out.println();
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);


	}
}
