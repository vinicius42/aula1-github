package controle_de_fluxo;

import java.util.Scanner;

public class exemplo_if {

	public static void main(String[] args) {
		String nome = "";
		Scanner teclado = new Scanner(System.in);
		nome = teclado.next();
		if(nome.equalsIgnoreCase("Vinicius")) {
			System.out.println("Não é");
		}
		else {
			System.out.println("Tudo ok");
		}

	}

}
