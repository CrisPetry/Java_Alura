package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Cristian");
		cc1.setTitular(cliente1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Kétlin");
		cc2.setTitular(cliente2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Corteze");
		cc3.setTitular(cliente3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente cliente4 = new Cliente();
		cliente4.setNome("Edenilson");
		cc4.setTitular(cliente4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

//		lista.sort(new NumeroDaContaComparator());

		//lista.sort(null);


		Collections.sort(lista, new NumeroDaContaComparator());
		Collections.reverse(lista);
//		Collections.rotate(lista, 5);
//		Collections.sort(lista);

		System.out.println("----------------------------------------------");

		for (Conta i : lista) {
			System.out.println(i + " Titular: " + i.getTitular().getNome());
		}

	}
}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();

		return (nomeC1.compareToIgnoreCase(nomeC2));
	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//
//		return 0;

//		return c1.getNumero() - c2.getNumero();

		return Integer.compare(c1.getNumero(), c2.getNumero());
	}

}
