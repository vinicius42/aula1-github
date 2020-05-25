package exercicio;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		x = teclado.nextInt();
		
		System.out.println("Informe um valor: ");
		y = teclado.nextInt();
		
		if(x > y) {
			for(int i = x; i >= y; i--) {
				System.out.println(i);
		}
			}
			else {
				for(int i = x; i <= y; i++) {
					System.out.println(i);
			}
		
		}
		
	
		}


	}


