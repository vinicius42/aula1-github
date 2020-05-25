package aula3;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// 7 - Imprimir os n elementos da sequencia de Fibonacci, onde n é informado pelo usuário
		int i=1,k=1,j=1,m=0,y;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um valor para ser a sequencia da Fibonacci:");
		y = teclado.nextInt();		
		for (i=1;i<=y;i++) {
			m=k+j;
			k=j;
			j=m;
			System.out.println(j);
			
		}
		

	}

}
