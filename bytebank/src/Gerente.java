//Gerente é um Funcionario e deverá herda atributos da Classe Funcionario para não duplicar código, assina o contrato Autenticavel, é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	
	//Bonificação de salario do Gerente é 1 salário utilizando variavel da superClass
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;	
		}
	}
}
