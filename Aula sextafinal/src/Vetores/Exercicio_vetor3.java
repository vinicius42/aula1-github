package Vetores;

import java.util.Scanner;

public class Exercicio_vetor3 {

	public static void main(String[] args) {
		// Receber n nomes informados pelo usuário
		// Onde n também será informado por ele.
		int tamanho = 0;
		System.out.println("Qual é o tamanho do vetor?");
		Scanner teclado = new Scanner(System.in);
		tamanho = teclado.nextInt();
		String[] vetor = new String[tamanho]; // Cria o vetor de acordo com o número de N
		teclado = null;/// Zerar o BUFFER DO TECLADO 
		teclado = new Scanner(System.in);/// REINICIAR O TECLADO
		
		// Iterar o vetor para receber os nomes digitados pelo usuário.
		for (int i=0;i<vetor.length;i++) {
			System.out.println("Informe o nome "+i+":");
			vetor[i] =teclado.nextLine();
		}
		for (int i=0;i<vetor.length;i++) {
			System.out.println(vetor[i]);
		}
		
		

	}

}
