package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(1072, 13);

		cc.deposita(200.0);

		ContaPoupanca cp = new ContaPoupanca(1225, 10);

		cp.deposita(100.0);

		cc.transfere(20.0, cp);

		System.out.println("CC: " + cc.getSaldo());

		System.out.println("CP: " + cp.getSaldo());
	}
}
