package secao4;

import java.util.Scanner;

public class Ler {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String x;
		x = leia.nextLine(); // Para Strings
		leia.nextLine(); // Para consumir linha que possa ficar vazia
		int i = leia.nextInt(); // Para inteiro
		double y = leia.nextDouble(); // Para double e preciso digitar com a vírgula ou se quiser com o ponto setar o Locale
		char j = leia.next().charAt(0);

	}

}
