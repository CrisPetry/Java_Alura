package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

//		Integer idadeRef = Integer.valueOf(29); // autoboxing
//		System.out.println(idadeRef.doubleValue()); // unboxing
//
//		Double dRef = Double.valueOf(3.2);
//		System.out.println(dRef.doubleValue());
//
//		Boolean bRef = Boolean.TRUE;
//
//		System.out.println(bRef.booleanValue());
//		
//		Number ref = Integer.valueOf(22);
//		
//		System.out.println(ref.intValue());
//		
		List<Number> numeros = new ArrayList<Number>();

		numeros.add(102);
		numeros.add(12);
		numeros.add(22);
		numeros.add(32);
		numeros.add(45);

		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
			System.out.println(numeros.size());
		}

	}

}
