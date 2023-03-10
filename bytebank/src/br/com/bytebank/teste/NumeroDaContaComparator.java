package br.com.bytebank.teste;

import java.util.Comparator;

import br.com.bytebank.banco.modelo.Conta;

public class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
//		return c1.getNumero() - c2.getNumero();
//		
//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		
//		return 0;
	}

}
