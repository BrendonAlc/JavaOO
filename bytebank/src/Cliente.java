
public class Cliente implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	//método para classe AutenticacaoUtil realizar verificação de senha
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	//Autenticação da senha, delegando a chamada para o método util criando para chamar a classe AutenticacaoUtil
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}	
}
