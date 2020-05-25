package treinando;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v = 0;
		String resp = "s";
		
		while(resp.equalsIgnoreCase("s")) {
			System.out.println("Informe um valor para saber a tabuada: ");
			v = teclado.nextInt();
			for(int i = 1; i < 11; i++) {
				int conta = v * i;
				System.out.println(v + " x " + i + " = " + conta);
			}
			System.out.println("Deseja continuar ?");
			resp = teclado.next();
		}

	}

}
