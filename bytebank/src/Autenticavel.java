//contrato Autenticavel
	//quem assinar este contrato, precisa implementar
		//método setSenha
		//método autentica

//Interface abstrata intermediaria de funcionário para que somente funcionarios autenticaveis tenham senha de acesso.
public abstract interface Autenticavel{
	
	public abstract void setSenha(int senha);
	
	//método de autenticação de senha em boleano
	public abstract boolean autentica(int senha);
}
