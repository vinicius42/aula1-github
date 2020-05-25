package exercicio;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int k = 0;
		int j = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe uma quantidade de elementos: ");
		j = teclado.nextInt();
		
		for(int i = 0; i <= j; i++) {
			k = x + y;
			x = y;
			y = k;
			System.out.println(y);
		}

	}

}
