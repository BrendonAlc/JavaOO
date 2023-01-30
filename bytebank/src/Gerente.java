//Gerente é um funcionário e deverá herda atributos da Classe funcionário para não duplicar código
public class Gerente extends Funcionario {
	
	private int senha; //atributo para autenticação de senha
	
	
	//método de autenticação de senha em boleano
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	//Bonificação de salario do Gerente é 1 salário utilizando variavel da superClass
	public double getBonificacao() {
		return super.getSalario();
	}
	
}
