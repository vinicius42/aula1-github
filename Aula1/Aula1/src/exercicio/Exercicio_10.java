package exercicio;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int a = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		x = teclado.nextInt();
		
		System.out.println("Informe outro número: ");
		y = teclado.nextInt();
		
		if(x < y) {
			a = y;
			y = x;
			x = a;
		}
		for(int i = x; i >= y; i--) {
			System.out.println(i);
	
		}

	}

}
