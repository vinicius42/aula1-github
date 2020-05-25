package prova;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = 1;
		int a = 0;
		int z = 0;
		
		for(int i = 0; i <= 13; i++) {
			z = x + a;
			a = x;
			x = z;
			System.out.println(x);
		}

	}

}
