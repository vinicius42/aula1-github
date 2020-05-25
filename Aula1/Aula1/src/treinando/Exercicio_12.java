package treinando;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade;
		String resp = "";
		
		System.out.println("Você deseja saber se é maior ou menor de idade ? (s/n)");
		resp = teclado.nextLine();
		
		while(resp.equalsIgnoreCase("s")) {
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
