
public class ContaCorrente extends Conta implements Tributavel{
	
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); //Construtor da classe mãe
	}
	
	@Override
	public boolean saque(double valor) {
		double valorASacar = valor + 0.2;
		return super.saque(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	//retorno da classe super para imposto da contaCorrente
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
