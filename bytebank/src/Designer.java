//Criar polimorfismo da classe Funcionario para bonificacao
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer");
		return 200;
	}
}
