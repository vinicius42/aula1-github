package While;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Agora, crie um programa que receba qualqer n�mero enquanto o 
		// usu�rio desejar repetir. Por�m, em caso desse n�mero ser primo, 
		// o la�o de repeti��o deve ser interrompido imediatamente 
		// (utilize o comando break)
		int numero=0,i=0;
		Scanner teclado = new Scanner (System.in);
		String resposta = "s";
		while(resposta.equalsIgnoreCase("s")) {
			System.out.println("Informe um para verificar se � primo:");
			numero = teclado.nextInt();
			for(i=1;i<=numero;i++) {
				if (i/numero==1) {
					System.out.println("O n�mero � primo");
				}
			}
			System.out.println("Deseja conferir outro n�mero? (s/n)");
			resposta = teclado.next();
		}
	}

}
