package br.com.bytebank.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.*;

public class TesteReferencias {
	
	public static void main(String[] args) throws SaldoInsuficienteException{
		
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

		System.out.println();
		System.out.println("---Teste de implementação da Interface Tributavel---");
		System.out.println();
		
		ContaCorrente br = new ContaCorrente(222, 333);
		br.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(br);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
		System.out.println();
		System.out.println("---Teste Utilizando trow no método Saque---");
		System.out.println();
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(300.0);
		conta.saque(300.0);
		
		System.out.println(conta.getSaldo());
		
		System.out.println();
		System.out.println("---Teste de ArrayList---");
		System.out.println();
		
		//Utilizando generics
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		

		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		System.out.println("----------");
		
		for(Conta conta1 : lista) {
			System.out.println(conta1);
		}
		
		System.out.println();
		System.out.println("**Teste Generics com equals**");
		System.out.println();
		
		ArrayList<Conta> lista1 = new ArrayList<Conta>();
		
		Conta cc5 = new ContaCorrente(44, 44);
		lista.add(cc5);
		
		Conta cc6 = new ContaCorrente(44, 45);
		lista.add(cc6);
		
		Conta cc7 = new ContaCorrente(44, 46);
		boolean existe = lista.contains(cc7);
		
		System.out.println("Conta já existe? " + existe);
		
		for(Conta conta3 : lista) {
			System.out.println(conta3);
		}
		
		System.out.println();
		System.out.println("**Teste Generics com LinkedList**");
		System.out.println();
		
		
		List<Conta> lista2 = new ArrayList<Conta>();
		
		Conta cc8 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cc9 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref1 = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		System.out.println("----------");
		
		for(Conta conta1 : lista) {
			System.out.println(conta1);
		}
	
	}
}
