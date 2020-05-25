package Vetores;

import java.util.Scanner;

public class Exercicio_vetor4 {

	public static void main(String[] args) {
		// Criar um vetor de inteiros cujo tamanho seja informado pelo usuário
		// Receber uma sequência de números informados pelo usuário
		// Cada número será gravado em um elemento do vetor
		
		// Ao final imprimir:
		// A soma dos valores digitos.
		// A média dos valores digitados.
		int tamanho = 0;
		int soma=0;
		System.out.println("Qual é o tamanho do vetor?");
		Scanner teclado = new Scanner(System.in);
		tamanho = teclado.nextInt();
		int[] vetor = new int[tamanho]; // Cria o vetor de acordo com o número de N
		teclado = null;/// Zerar o BUFFER DO TECLADO 
		teclado = new Scanner(System.in);/// REINICIAR O TECLADO
		
		// Iterar o vetor para receber os nomes digitados pelo usuário.
		for (int i=0;i<vetor.length;i++) {
			System.out.println("Informe um número inteiro "+i+":");
			vetor[i] = teclado.nextInt();
			soma+=vetor[i];
		}
		System.out.println("Soma do vetor: "+soma);
		System.out.println("Média do vetor: "+soma/tamanho);
	}
}
