package treinando;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 11;
		String resp = "s";

		while(resp.equalsIgnoreCase("s") && idade > 10) {
			System.out.println("Informe sua idade: ");
			idade = teclado.nextInt();
			if(idade >= 18) {
				System.out.println("Você é maior de idade!");
			}
			else {
				System.out.println("Vaza menó");
			}
			System.out.println("Deseja continuar ? (s/n)");
			resp = teclado.next();
		}

	}

}
