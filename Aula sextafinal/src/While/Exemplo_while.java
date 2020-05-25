package While;

import java.util.Scanner;

public class Exemplo_while {

	public static void main(String[] args) {
		// Primeiro exemplo de while
		Scanner tec = new Scanner(System.in);
		String resposta = "s";
		while(resposta.equalsIgnoreCase("s")) {
			System.out.println("Teste");
			System.out.println("Continuar? (s/n)");
			resposta = tec.next();
		}
		System.out.println("Fim acabou");

	}

}
