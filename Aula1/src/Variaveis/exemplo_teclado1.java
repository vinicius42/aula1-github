package Variaveis;

import java.util.Scanner;

public class exemplo_teclado1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // New -> Cria um objeto do zero, constroi pela primeira vez
		String nome = "";
		int idade = 0;
		
		System.out.println("Qual é a sua idade ?");
		idade = teclado.nextInt();
		
		teclado = null;
		teclado = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome ?");
		nome = teclado.nextLine(); // Quando usa o nextLine, tem que destruir e depois recriar novamente
		
		
		System.out.println("Seu nome é " + nome + ", Você tem " + idade + " anos.");

	}

}
