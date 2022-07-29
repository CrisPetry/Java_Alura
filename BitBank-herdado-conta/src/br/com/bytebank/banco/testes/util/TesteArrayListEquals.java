package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 12);
		lista.add(cc);

		Conta cp = new ContaPoupanca(21, 22);
		lista.add(cp);

		Conta cc1 = new ContaCorrente(22, 12);
		boolean exist = lista.contains(cc1);

		System.out.println("já existe? " + exist);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
