package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];
		ContaCorrente cc1 = new ContaCorrente(22, 33);
		ContaPoupanca cc2 = new ContaPoupanca(22, 21);
		Cliente cliente = new Cliente();

		referencias[0] = cc1;
		referencias[1] = cc2;
//		referencias[2] = cliente;
//		cliente.setNome("Cristian");
//		cliente.setCpf("02705570080");
//		cliente.setProfissao("Programador");

		ContaPoupanca ref = (ContaPoupanca) referencias[1];

//		System.out.printf("Nome: %s\nCPF: %s\nProfissão: %s \n", cliente.getNome(), cliente.getCpf(),
//				cliente.getProfissao());
		System.out.printf("Agência: %d  Número da conta: %d ", ref.getAgencia(), ref.getNumero());
	}
}
