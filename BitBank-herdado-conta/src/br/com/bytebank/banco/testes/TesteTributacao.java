package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.*;

public class TesteTributacao {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 011);
		cc.deposita(100.00);

		SeguroDeVida seg = new SeguroDeVida();

		CalculadorDeImposto ci = new CalculadorDeImposto();
		ci.registra(cc);
		ci.registra(seg);

		System.out.println(ci.getTotalImposto());
	}
}
