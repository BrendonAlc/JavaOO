
public class TesteGerente {
	public static void main(String[] args) {
		
		//Criar dados de gerente
		Gerente g1 = new Gerente();
		
		g1.setNome("Luciana");
		g1.setCpf("2222222248");
		g1.setSalario(1000.0);
		
		System.out.println("Nome do gerente é " + g1.getNome());
		System.out.println("Cpf do gerente é " + g1.getCpf());
		System.out.println("O salário do gerente é " + g1.getSalario());
		
		//Criar senha
		g1.setSenha(1234);
		boolean autenticou = g1.autentica(1234);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}
