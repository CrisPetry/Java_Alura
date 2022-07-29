package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();

		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);

		Conta cc2 = new ContaCorrente(22, 12);
		guardador.adiciona(cc2);

		int tamanho = guardador.getQtdElementos();
		System.out.println("Tamanho do array utilizado: " + tamanho);

		Conta ref = (Conta) guardador.getReferencia(1);
		System.out.printf("Agência: %d\nNúmero da Conta: %d", ref.getAgencia(), ref.getNumero());
	}
}
