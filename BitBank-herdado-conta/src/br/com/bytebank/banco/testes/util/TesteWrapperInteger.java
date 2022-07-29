package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		Integer idade = 29;
		int idade2 = 32;

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);
		numeros.add(idade2);
		
		Integer idadeRef = Integer.valueOf(22);
		int valor =  idadeRef.intValue();
		
		System.out.println(valor);

		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
	}
}
