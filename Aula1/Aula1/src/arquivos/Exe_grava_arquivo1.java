package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exe_grava_arquivo1 {

	public static void main(String[] args) {
		int n; // Para a tabuada
		Scanner teclado = new Scanner(System.in);
		System.out.println("Valor para a tabuada: ");
		n = teclado.nextInt();
		
		// Iniciar a criação do arquivo
		try {
			FileWriter arquivo = new FileWriter("D:\\tabuada.txt", true); // O true acrescenta linhas no arquivo
			PrintWriter gravador = new PrintWriter(arquivo);
			for(int i = 1; i <= 10; i++) {
				gravador.write(n + " x " + i + " = " + i * n + System.lineSeparator());
			}
			// Finalizar a gravação
			arquivo.flush();
			arquivo.close();
			gravador.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
