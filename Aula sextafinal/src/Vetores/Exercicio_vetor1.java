package Vetores;

import java.util.Scanner;

public class Exercicio_vetor1 {

	public static void main(String[] args) {
		// Criar um vetor com tamanho terminado pelo usu�rio
		Scanner teco = new Scanner(System.in);
		int tamanho = 0;
		System.out.println("Qual � o tamanho do vetor que deseja");
		tamanho = teco.nextInt();
		int[] vetor = new int[tamanho];
		System.out.println(vetor.length);// Imprime o tamanho do vetor;

	}

}
