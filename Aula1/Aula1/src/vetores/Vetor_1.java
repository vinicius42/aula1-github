package vetores;

import java.util.Scanner;

public class Vetor_1 {

	public static void main(String[] args) {
		// Criar um vetor com tamanho determinado pelo usuário
		Scanner teclado = new Scanner(System.in);
		int tamanho = 0;
		System.out.println("Qual é o tamanho para o vetor ?");
		tamanho = teclado.nextInt();
		int[] vetor = new int[tamanho];
		System.out.println(vetor.length); // Imprime o tamanho do vetor

	}

}
