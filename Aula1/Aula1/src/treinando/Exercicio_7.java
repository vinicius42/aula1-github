package treinando;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		int x = 1;
		int a = 1;
		int z = 0;
		
		System.out.println("Informe uma quantidade de elementos: ");
		n = teclado.nextInt();
		
		for(int i = 0; i <= n; i++) {
			z = x + a;
			a = x;
			x = z;
			System.out.println(x);
		}
		
		

	}

}
