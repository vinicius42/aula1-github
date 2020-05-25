package secao10;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// Tipo valor
		/*
		 * int n = leia.nextInt(); double[] vetor = new double[n];
		 * 
		 * for (int i = 0; i < vetor.length; i++) { vetor[i] = leia.nextDouble(); }
		 * 
		 * double soma = 0.0; for (int i = 0; i < vetor.length; i++) { soma += vetor[i];
		 * }
		 * 
		 * double media = soma / n;
		 * 
		 * System.out.println("Resultado: " + media);
		 */
		
		
		// Tipo referência
		int n = leia.nextInt();
		Produto[] vetor = new Produto[n];
		
		for (int i = 0; i < vetor.length; i++) {
			// Não esquece que quando for usar o nextLine e tiver um nextInt antes, deve criar mais um next para consumir a linha
			// vazia
			leia.nextLine();
			String name = leia.nextLine();
			double preco = leia.nextDouble();
			vetor[i] = new Produto(name, preco);
		}
		
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		double media = soma / vetor.length;
		
		System.out.println("Média: " + media);
		
		leia.close();

	}

}
