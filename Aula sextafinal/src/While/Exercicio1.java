package While;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1 - Solicite a idade do usu�rio, verifique se ele � menor ou maior de idade 
		// e imprima essa conclus�o na tela.
		// Repita enquanto usu�rio desejar
		int idade;
		Scanner teclado = new Scanner (System.in);
		String resposta = "s";
		while(resposta.equalsIgnoreCase("s")) {
			System.out.println("Informe a sua idade");
			idade = teclado.nextInt();
			if (idade>=18) {
				System.out.println("Voc� � maior de idade");
			}
			else {
				System.out.println("Voc� � menor de idade");
			}
			System.out.println("Deseja conferir outra pessoa? (s/n)");
			resposta = teclado.next();
		}
		
		

	}

}
