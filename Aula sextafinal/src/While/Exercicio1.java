package While;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1 - Solicite a idade do usuário, verifique se ele é menor ou maior de idade 
		// e imprima essa conclusão na tela.
		// Repita enquanto usuário desejar
		int idade;
		Scanner teclado = new Scanner (System.in);
		String resposta = "s";
		while(resposta.equalsIgnoreCase("s")) {
			System.out.println("Informe a sua idade");
			idade = teclado.nextInt();
			if (idade>=18) {
				System.out.println("Você é maior de idade");
			}
			else {
				System.out.println("Você é menor de idade");
			}
			System.out.println("Deseja conferir outra pessoa? (s/n)");
			resposta = teclado.next();
		}
		
		

	}

}
