package desafio;

import java.util.Scanner;

public class Desafio_par_impar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Informe um n�mero: ");
		numero = teclado.nextInt();		
		if (numero % 2 == 0) {
			System.out.println("O n�mero" + " "+ numero + " " + "� par!");
		}
		else {
			System.out.println("O n�mero" + " "+ numero + " " + "� �mpar!");
		}

	}

}
