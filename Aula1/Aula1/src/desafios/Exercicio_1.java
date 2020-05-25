package desafios;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		int x = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o máximo de valores a ser mostrado: ");
		x = teclado.nextInt();
		for(int i = 2; i <= x; i+=3) {
			System.out.println(i);
		}

	}

}
