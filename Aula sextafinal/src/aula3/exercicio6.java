package aula3;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// 6 - Imprimir uma sequência de acordo com dois valores informados pelo usuário. 
		// Atenção: Se o usuário informar números decrescentes, sua sequencia deve ser decrescente. 
		// Se o usuário informar números crescentes, sua sequencia deve ser crescente também.
		int valor1=0,valor2=0,i,b;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro valor:");
		valor1 = teclado.nextInt();
		System.out.println("Informe o segundo valor:");
		valor2 = teclado.nextInt();
		if (valor1>valor2) {
			for (i=valor1;i>=valor2;i--) {
				System.out.println(i);		
		}
		}
		else {
			for (i=valor1;i<=valor2;i++) {
				System.out.println(i);		
		}
			
		}

	}

}
