package ExerciciosPedroHenriqueSilva;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// 2 - Dado que a sequencia S é iterada de acordo com an = 2n-1.  Imprima os 10 primeiros valores
		int i,n,p;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro valor:");
		n = teclado.nextInt();
		for(i=0;i<=10;i++) {
			p = 2*n-1;
			n=p;
			System.out.println(p);
		}

	}

}
