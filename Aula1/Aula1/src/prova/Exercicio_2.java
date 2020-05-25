package prova;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = 0;
		double y;
		int n = 1;		
		
		System.out.println("Informe o índice que o valor deve parar: ");
		x = teclado.nextInt();
		
		for(int i = 0; i <= x; i++) {
			y = Math.pow(n, 2) + (3 * n);
			System.out.println(y);
			n += 1;
		}

	}

}
