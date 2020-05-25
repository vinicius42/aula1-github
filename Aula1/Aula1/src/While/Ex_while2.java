package While;

import java.util.Scanner;

public class Ex_while2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 11;
		String resposta = "s";
		
		
		
		while(resposta.equalsIgnoreCase("s") && idade > 10) {
			System.out.println("Informe sua idade: ");
			idade = teclado.nextInt();
			
			if(idade >= 18) {
				System.out.println("Você é maior de idade");
			}else {
				System.out.println("Volta pra escolinha criança");
			}
			System.out.println("Continuar ? (s/n)");	
			resposta = teclado.next();
		}
			
	}

	}

