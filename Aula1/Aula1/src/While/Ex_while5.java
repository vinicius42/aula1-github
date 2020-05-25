package While;

import java.util.Scanner;

public class Ex_while5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		int conta;
		String resposta = "s";
		
		
		while(resposta.equalsIgnoreCase("s")) {
			System.out.println("Informe um valor: ");
			num = teclado.nextInt();
			for(int i = 1; i <= 10; i++) {
				conta = num * i;
				System.out.println(num + " x " + i + " = " + conta);
			}
			System.out.println("Continuar ? (s/n)");	
			resposta = teclado.next();
		}

	}

}
