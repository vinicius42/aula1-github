package Vetores;

import java.util.Scanner;

public class Exercicio_vetor3 {

	public static void main(String[] args) {
		// Receber n nomes informados pelo usu�rio
		// Onde n tamb�m ser� informado por ele.
		int tamanho = 0;
		System.out.println("Qual � o tamanho do vetor?");
		Scanner teclado = new Scanner(System.in);
		tamanho = teclado.nextInt();
		String[] vetor = new String[tamanho]; // Cria o vetor de acordo com o n�mero de N
		teclado = null;/// Zerar o BUFFER DO TECLADO 
		teclado = new Scanner(System.in);/// REINICIAR O TECLADO
		
		// Iterar o vetor para receber os nomes digitados pelo usu�rio.
		for (int i=0;i<vetor.length;i++) {
			System.out.println("Informe o nome "+i+":");
			vetor[i] =teclado.nextLine();
		}
		for (int i=0;i<vetor.length;i++) {
			System.out.println(vetor[i]);
		}
		
		

	}

}
