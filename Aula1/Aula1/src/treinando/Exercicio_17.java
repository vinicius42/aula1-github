package treinando;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		int soma = 0;
		int media;
		
		System.out.println("Informe o tamanho do vetor: ");
		n = teclado.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o " + (i + 1) + "°" + " número: ");
			vetor[i] = teclado.nextInt();
			soma += vetor[i];
		}
		media = soma/n;
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A média dos valores é: " + media);

	}

}
