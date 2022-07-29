package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.*;

public class testeSaca {
	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 321);

		conta.deposita(100.0);
		try {
			conta.saca(100.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(conta.getSaldo());
	}
}
