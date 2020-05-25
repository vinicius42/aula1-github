package While;

import java.util.Scanner;

public class ex_while {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String resposta = "s";
		
		while(resposta.equalsIgnoreCase("s")) {
			System.out.println("Teste");
			System.out.println("Continuar ? (s/n)");	
			resposta = teclado.next();
		}
		System.out.println("Fim");
	}

}
