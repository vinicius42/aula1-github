package exercicio;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		String[] nome; // Criação dos vetores
		double[] notas;
		int q = 0; // Quantidade de alunos
		int menor = 0; 
		int maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe quantos alunos há na turma: ");
		q = teclado.nextInt();
		
		
		// Alocação da memória para os vetores
		nome = new String[q];
		notas = new double[q];
		
		for(int i = 0; i < q; i++) {
			teclado = null;
			teclado = new Scanner(System.in);
			System.out.println("Nome: ");
			nome[i] = teclado.nextLine(); // NextLine apresenta problemas ao acessar o buffer, portanto destrua o teclado
			System.out.println("Nota: ");
			notas[i] = teclado.nextDouble();
			
			if(notas[i] > notas[maior]) {
				maior = i;
			}
			
			if(notas[i] < notas[menor]) {
				menor = i;
			}
		}
		
		// Relatório de notas
		for(int i = 0; i < q; i++) {
			System.out.println("Nome: \t Nota:");
			System.out.println(nome[i] + " \t" + notas[i]);
			
		}
		System.out.println("Menor nota: Nome: " + nome[menor] + " , nota " + notas[menor]);
		System.out.println("Menor nota: Nome: " + nome[maior] + " , nota " + notas[maior]);

	}

}
