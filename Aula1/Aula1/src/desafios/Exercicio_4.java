package desafios;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		double a, q;
		a = 1;
		q = 5;
		double prox = 0;
		
		for(int i = 0; i < 10; i++) {
			prox = a * q;
			a = prox;
			System.out.println(a);
		}
		
	}

}
