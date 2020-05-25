package desafio;

import java.util.Scanner;

public class Desafio_media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, numero3, numero4 = 0;
		int soma = 0;
		double media = 0;
		
		System.out.println("Favor informar um número: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Favor informar mais um número: ");
		numero2 = teclado.nextInt();
		
		System.out.println("Favor informar mais um número: ");
		numero3 = teclado.nextInt();
		
		System.out.println("Informe o último número: ");
		numero4 = teclado.nextInt();
		
		soma = numero1 + numero2 + numero3 + numero4;
		media = soma/4;
		
		System.out.println("O total da soma é: " + soma);
		
		System.out.println("A média é: " + media);
		

	}

}
