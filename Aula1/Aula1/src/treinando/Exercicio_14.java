package treinando;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1 = 1, n2 = 1;
		int resp = 1;
		
		while(n1 != 0 && n2 != 0) {
			System.out.println("Informe um valor: ");
			n1 = teclado.nextInt();
			
			System.out.println("Informe outro valor: ");
			n2 = teclado.nextInt();
			
			int maior;
			if(n1 > n2) {
				System.out.println("O maior valor informado é: " + n1);
			}
			else {
				System.out.println("O maior valor informado é: " + n2);
			}
			System.out.println("Fim");
		}

	}

}
