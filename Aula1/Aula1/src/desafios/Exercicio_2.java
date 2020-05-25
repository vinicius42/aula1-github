package desafios;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = 0;		
		
		System.out.println("Informe um valor para a sequência: ");
		x = teclado.nextInt();
		
		
		for(int i = 0; i < 10; i++) {
			x = 2*(x - 1);
			System.out.println(x);
		}

	}

}
