package vetores;

import java.util.Scanner;

public class Vetor_2 {

	public static void main(String[] args) {
		// receber n nomes informados pelo usu�rio
		// onde n ser� informado pelo usu�rio
		
		Scanner teclado = new Scanner(System.in);
		int tamanho = 0;
		System.out.println("Quantos nomes deseja inserir ?");
		tamanho = teclado.nextInt();
		teclado = null; // Destruir o teclado para limpar o buffer
		teclado = new Scanner(System.in); // Criar o teclado para continuar digitando
		String[] vetor = new String[tamanho]; // Cria o vetor de acordo com o usu�rio
		
		// Iterar no vetor para receber os nomes digitados pelo usu�rio
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Nome" + i + ":");
			vetor[i] = teclado.nextLine();
		}
		
		// Imprimir os nomes digitados pelo usu�rio
		System.out.println("Nomes informados pelo usu�rio");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
