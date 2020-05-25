package so_criptografia;

import java.util.Scanner;

public class Teste {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		System.out.print("1. Criptografar(1)\n2. Descriptografar(2)\nEscolha: ");
		int a = teclado.nextInt();
		teclado.nextLine();

		if (a == 1) {
			System.out.println("---Criptografando---");
			encripCypher();
		}
		else if(a == 2) {
			System.out.println("---Descriptografar---");
		}
		else {
			System.out.println("Não existe");
		}

	}

	private static void encripCypher() {
		System.out.print("Digite a mensagem: ");
		String message = teclado.nextLine();
		// removendo os espaços em branco da mensagem
		message = message.replaceAll("\\s", "");
		teclado.nextLine();
		
		System.out.println("Informe a chave");
		int key = teclado.nextInt();
		teclado.nextLine();
		
		char[][] rail = new char[key][message.length()];
		// Matriz
		for (int i = 0; i < key; i++) {
			for (int j = 0; j < message.length(); j++) {
				rail[i][j] = ',';				
			}
			
		}
		for (int i = 0; i < key; i++) {
			for (int j = 0; j < message.length(); j++) {
				System.out.print(rail[i][j]);				
			}
			System.out.println();
		}
		
		
		
	}

}
