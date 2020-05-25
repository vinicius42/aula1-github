package vetores;

import java.util.Scanner;

public class Vetor_3 {

	public static void main(String[] args) {
		// Criar um vetor cujo tamanho seja informado pelo usuário
		// Receber uma sequência de números informados pelo usuário
		// Cada número será gravado em um elemento do vetor
		
		// Ao final imprimir:
		// - A soma dos valores digitados
		// - A média dos valores digitados
		
		Scanner teclado = new Scanner(System.in);
		int tamanho = 0;
		double soma = 0;
		double media = 0;
		System.out.println("Qual o tamanho do vetor ?");
		tamanho = teclado.nextInt();
		int[] vetor = new int[tamanho];
		String[] vetor1 = new String[tamanho];

		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Informe números inteiros: ");
			vetor [i] = teclado.nextInt();
			teclado = null;
			teclado = new Scanner(System.in);
			System.out.println("Informe o nome inteiros: ");
			vetor1 [i] = teclado.nextLine();
			soma += vetor[i];
		}
		System.out.println("O total da soma é: " + soma);
		System.out.println("A média é: " + soma/tamanho);
		

	}

}
