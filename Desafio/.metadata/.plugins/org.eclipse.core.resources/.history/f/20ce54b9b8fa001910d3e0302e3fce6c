package ascii;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class Ascii {
	private static final String PATH_ASCII = "D:\\testeAscii";
	private static final String PATH_BINARIO = "D:\\testeBinario.bin";
	private static final int N = 1000000;

	public static void main(String[] args) {
		String linha = "";
		
		// escrevendo de 0 a N no formato ASCII
		try (PrintWriter writer = new PrintWriter(PATH_ASCII, "US-ASCII")) {
			for (int i = 0; i < N; i++)
				writer.print(i);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		// escrevendo de 0 a N em binário
		try (PrintWriter writer = new PrintWriter(PATH_BINARIO)) {
			for (int i = 0; i < N; i++)
				writer.write(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fim!");

	}
}
