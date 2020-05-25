package aula3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int valor1=0,valor2=0,i,b;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro valor:");
		valor1 = teclado.nextInt();
		System.out.println("Informe o segundo valor:");
		valor2 = teclado.nextInt();
		if (valor1<valor2) {
			b=valor2;
			valor2=valor1;
			valor1=b;			
		}
		for (i=valor1;i>=valor2;i--) {
			System.out.println(i);
		}
		
		
		
		

	}

}
