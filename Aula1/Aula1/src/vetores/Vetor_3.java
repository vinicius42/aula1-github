package vetores;

import java.util.Scanner;

public class Vetor_3 {

	public static void main(String[] args) {
		// Criar um vetor cujo tamanho seja informado pelo usu�rio
		// Receber uma sequ�ncia de n�meros informados pelo usu�rio
		// Cada n�mero ser� gravado em um elemento do vetor
		
		// Ao final imprimir:
		// - A soma dos valores digitados
		// - A m�dia dos valores digitados
		
		Scanner teclado = new Scanner(System.in);
		int tamanho = 0;
		double soma = 0;
		double media = 0;
		System.out.println("Qual o tamanho do vetor ?");
		tamanho = teclado.nextInt();
		int[] vetor = new int[tamanho];
		String[] vetor1 = new String[tamanho];

		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Informe n�meros inteiros: ");
			vetor [i] = teclado.nextInt();
			teclado = null;
			teclado = new Scanner(System.in);
			System.out.println("Informe o nome inteiros: ");
			vetor1 [i] = teclado.nextLine();
			soma += vetor[i];
		}
		System.out.println("O total da soma �: " + soma);
		System.out.println("A m�dia �: " + soma/tamanho);
		

	}

}
