package desafio;

import java.util.Scanner;

public class desafio_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.println("Favor informar um n�mero: ");
		x = teclado.nextInt();
		
		System.out.println("O n�mero �: " + x);
		
		System.out.println("Favor informar outro n�mero: ");
		y = teclado.nextInt();
		
		System.out.println("O n�mero �: " + y);
		
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		
		System.out.println("O novo n�mero 1 �: " + x);
		
		System.out.println("O segundo n�mero �: " + y);
		

	}

}
