package aula3;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// 6 - Imprimir uma sequ�ncia de acordo com dois valores informados pelo usu�rio. 
		// Aten��o: Se o usu�rio informar n�meros decrescentes, sua sequencia deve ser decrescente. 
		// Se o usu�rio informar n�meros crescentes, sua sequencia deve ser crescente tamb�m.
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
