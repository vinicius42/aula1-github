package exercicio;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		int q = 0;
		int soma = 0;
		double media = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Número de elementos: ");
		q = teclado.nextInt();
		
		int[] numeros = new int[q];
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o " + (i + 1) +"° valor: ");
			numeros[i] = teclado.nextInt();
			soma += numeros[i];
		}
		media = soma / numeros.length;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);

	}

}
