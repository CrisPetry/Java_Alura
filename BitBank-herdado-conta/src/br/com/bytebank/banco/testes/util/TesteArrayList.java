package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 10);
		lista.add(cc);

		Conta cp = new ContaPoupanca(23, 11);
		lista.add(cp);

		Conta cc1 = new ContaCorrente(22, 12);
		lista.add(cc1);

		Conta cp1 = new ContaPoupanca(23, 13);
		lista.add(cp1);

		System.out.println(lista.size());

		Conta ref = lista.get(0);

		System.out.println(ref.getNumero());

//		lista.remove(0);
//		System.out.println(lista.size());

//		for(int i=0; i<lista.size(); i++) {
//			Object refs = lista.get(i);
//			System.out.println(refs);
//		}

		for (Conta refs : lista) {
			System.out.println(refs);
		}

	}

}
