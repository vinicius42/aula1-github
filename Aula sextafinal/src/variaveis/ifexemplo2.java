package variaveis;

import java.util.Scanner;

public class ifexemplo2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 0;
		System.out.println("Digite sua idade:");
		idade = teclado.nextInt();
		if (idade<18) {
			System.out.println("Menor de idade");
		}
		else {
			if (idade >= 65) {
				System.out.println("Idoso");
			
		}
			else {
			System.out.println("Maior de idade");
		}
		

		}}}
