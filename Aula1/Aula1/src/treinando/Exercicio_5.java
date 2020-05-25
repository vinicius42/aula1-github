package treinando;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v1, v2, a;
		
		System.out.println("Informe um valor: ");
		v1 = teclado.nextInt();
		System.out.println("Informe outro valor: ");
		v2 = teclado.nextInt();
		
		if(v1 < v2) {
			a = v2;
			v2 = v1;
			v1 = a;		
		}
		for(int i = v1; i >= v2; i--) {
			System.out.println(i);
		}
	}

}
