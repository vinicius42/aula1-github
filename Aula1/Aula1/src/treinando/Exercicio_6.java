package treinando;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Informe um valor: ");
		n1 = teclado.nextInt();
		
		System.out.println("Informe um segundo valor: ");
		n2 = teclado.nextInt();
		
		if(n1 > n2) {
			for(int i = n1; i >= n2; i--) {
				System.out.println(i);
			}
		}
		else {
			for(int i = n1; i <= n2; i++) {
				System.out.println(i);
			}
		}

	}

}
