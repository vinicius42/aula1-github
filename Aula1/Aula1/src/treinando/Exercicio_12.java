package treinando;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade;
		String resp = "";
		
		System.out.println("Voc� deseja saber se � maior ou menor de idade ? (s/n)");
		resp = teclado.nextLine();
		
		while(resp.equalsIgnoreCase("s")) {
			System.out.println("Informe sua idade: ");
			idade = teclado.nextInt();
			if(idade >= 18) {
				System.out.println("Voc� � maior de idade!");
			}
			else {
				System.out.println("Vaza men�");
			}
			System.out.println("Deseja continuar ? (s/n)");
			resp = teclado.next();
		}

	}

}
