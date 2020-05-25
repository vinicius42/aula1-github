package While;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// 5 - Pergunte um valor para o usuário e imprima sua tabuada (1 a 10)
		// Repita enquanto o usuário desejar
		int ntabuada=0,i=0;
		Scanner teclado = new Scanner (System.in);
		String resposta = "s";
		while(resposta.equalsIgnoreCase("s")) {
			System.out.println("Informe um número para imprimir a tabuada:");
			ntabuada = teclado.nextInt();
			for(i=1;i<=10;i++) {
				System.out.println(i+"*"+ntabuada+"="+ntabuada*i);
			}
			System.out.println("Deseja conferir outra pessoa? (s/n)");
			resposta = teclado.next();
		}
	}
}
