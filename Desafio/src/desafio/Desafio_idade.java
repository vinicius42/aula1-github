package desafio;

import java.util.Scanner;

public class Desafio_idade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 0;
		
		
		System.out.println("Favor informar a idade: ");
		idade = teclado.nextInt();
		
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade");
		}
		else {
			System.out.println("Menor de idade");
		}

	}

}