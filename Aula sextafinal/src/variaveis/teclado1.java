package variaveis;

import java.util.Scanner;

public class teclado1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome = "";
		int idade = 0;
		System.out.println("Qual a sua idade?");
		idade = teclado.nextInt();
		teclado = null;
		teclado = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		nome = teclado.nextLine();		

		
		System.out.println("Seu nome é " + nome + ". Você tem "+idade+" anos. ");
	}

}
