package desafio;

import java.util.Scanner;

public class Desafio_media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, numero3, numero4 = 0;
		int soma = 0;
		double media = 0;
		
		System.out.println("Favor informar um n�mero: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Favor informar mais um n�mero: ");
		numero2 = teclado.nextInt();
		
		System.out.println("Favor informar mais um n�mero: ");
		numero3 = teclado.nextInt();
		
		System.out.println("Informe o �ltimo n�mero: ");
		numero4 = teclado.nextInt();
		
		soma = numero1 + numero2 + numero3 + numero4;
		media = soma/4;
		
		System.out.println("O total da soma �: " + soma);
		
		System.out.println("A m�dia �: " + media);
		

	}

}
