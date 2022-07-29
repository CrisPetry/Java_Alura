package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("estruturadedados2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		BufferedWriter bw = new BufferedWriter(new FileWriter("estruturadedados.txt"));
		bw.write("Elden Ring � foda patroa");
		bw.newLine();
		bw.write("Confia no pai");
		bw.close();

	}
}
