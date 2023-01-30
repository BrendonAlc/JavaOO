
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1337, 24226);
		
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		//Agencia número 1
		conta.setAgencia(1);
		System.out.println(conta.getAgencia());
		
		//Criando novo cliente através do setNome
		Cliente brendon = new Cliente();
		brendon.setNome("Brendon Alcântara");
		
		conta.setTitular(brendon);
		
		System.out.println(conta.getTitular().getNome());
		
		//Alterando profissão do cliente
		conta.getTitular().setProfissao("Contador");
		//alterando em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Contador");
		System.out.println(titularDaConta);
		System.out.println(brendon);
		System.out.println(conta.getTitular());
		
	}
}
