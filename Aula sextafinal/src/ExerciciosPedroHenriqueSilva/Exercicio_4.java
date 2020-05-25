package ExerciciosPedroHenriqueSilva;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// 4 - Imprima 100 os valores da sequencia dada por 
		// a2 =  a1 * q
		// a3 = a2 + q
		double a,q,prox,i;
		a=1;
		q=5;
		i=0;
		prox=0;
		for(i=0;i<=10;i++) {
			prox=a*q;
			System.out.println(prox);
			a=prox;
	}

}}
