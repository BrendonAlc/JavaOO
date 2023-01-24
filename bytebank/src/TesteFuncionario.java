
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario brendon = new Funcionario();
		brendon.setNome("Brendon Alcantara");
		brendon.setCpf("222.222.222.47");
		brendon.setSalario(2500.50);
		
		System.out.println(brendon.getNome());
		System.out.println(brendon.getBonificacao());
	}
}
