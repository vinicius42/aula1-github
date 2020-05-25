package While;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Agora, crie um programa que receba qualqer número enquanto o 
		// usuário desejar repetir. Porém, em caso desse número ser primo, 
		// o laço de repetição deve ser interrompido imediatamente 
		// (utilize o comando break)
		int numero=0,i=0;
		Scanner teclado = new Scanner (System.in);
		String resposta = "s";
		while(resposta.equalsIgnoreCase("s")) {
			System.out.println("Informe um para verificar se é primo:");
			numero = teclado.nextInt();
			for(i=1;i<=numero;i++) {
				if (i/numero==1) {
					System.out.println("O número é primo");
				}
			}
			System.out.println("Deseja conferir outro número? (s/n)");
			resposta = teclado.next();
		}
	}

}
