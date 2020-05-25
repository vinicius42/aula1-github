package so_criptografia;

import java.util.Scanner;

public class Exercicio_1 {
	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);

		System.out.print("1. Criptografar(1)\n2. Descriptografar(2)\nEscolha: ");
		int a = teclado.nextInt();
		teclado.nextLine();

		if (a == 1) {
			System.out.println("---Criptografando---");
			DescripCipher();

		} else if (a == 2) {
			System.out.println("---Descriptografando---");
			DescripCipher();
		} else {
			System.out.println("Tente de novo");
		}
	}

	private static void DescripCipher() {
		System.out.print("Escreva a mensagem: ");
		String mensagem = teclado.nextLine();
		// Aqui remove o espaço em branco da mensagem
		mensagem = mensagem.replaceAll("\\s", "");

		System.out.print("Informe a chave: ");
		int chave = teclado.nextInt();
		teclado.nextLine();

		char[][] rail = new char[chave][mensagem.length()];
		// Matriz
		for (int i = 0; i < chave; i++) {
			for (int j = 0; j < mensagem.length(); j++) {
				rail[i][j] = '.';
			}
		}

		// Colocando as letras na matriz, em zig-zag
		int row = 0;
		int b = 0;
		for (int i = 0; i < mensagem.length(); i++) {
			if (b == 0) {
				rail[row][i] = mensagem.charAt(i);
				row++;
				if (row == chave) {
					b = 1;
					row--;
				}
			} else if (b == 1) {
				row--;
				rail[row][i] = mensagem.charAt(i);
				if (row == 0) {
					b = 0;
					row = 1;
				}
			}
		}

		// Mudando a ordem das cifras
		int c = 0;
		for (int i = 0; i < chave; i++) {
			for (int j = 0; j < mensagem.length(); j++) {
				String temp = rail[i][j] + "";
				if (temp.matches("\\.")) {
					continue;
				} else {
					// Colocando as letras uma por uma em diagonal
					rail[i][j] = mensagem.charAt(c);
					c++;
				}
			}
		}

		// Checagem da reordem
		System.out.println("Reordem");
		for (int i = 0; i < chave; i++) {
			for (int j = 0; j < mensagem.length(); j++) {
				System.out.print(rail[i][j]);
			}
			System.out.println();
		}

		String textoDecryp = "";
		b = 0;
		row = 0;
		// Convertendo as cifras para uma linha
		for (int i = 0; i < mensagem.length(); i++) {
			if (b == 0) {
				textoDecryp += rail[row][i];
				row++;
				if (row == chave) {
					b = 1;
					row--;
				}
			} else if (b == 1) {
				row--;
				textoDecryp += rail[row][i];
				if (row == 0) {
					b = 0;
					row = 1;
				}
			}
		}

		System.out.println("Texto descriptografado: " + textoDecryp);

	}

	private static void EncripCypher() {
		System.out.print("Informe uma mensagem: ");
		String mensagem = teclado.nextLine();
		// Aqui remove o espaço em branco da mensagem
		mensagem = mensagem.replaceAll("\\s", "");

		System.out.print("Informe a chave: ");
		int chave = teclado.nextInt();
		teclado.nextLine();

		char[][] rail = new char[chave][mensagem.length()];
		// Matriz
		for (int i = 0; i < chave; i++) {
			for (int j = 0; j < mensagem.length(); j++) {
				rail[i][j] = '.';
			}
		}

		// Colocando as letras na matriz, em zig-zag
		int row = 0;
		int b = 0;
		for (int i = 0; i < mensagem.length(); i++) {
			if (b == 0) {
				rail[row][i] = mensagem.charAt(i);
				row++;
				if (row == chave) {
					b = 1;
					row--;
				}
			} else if (b == 1) {
				row--;
				rail[row][i] = mensagem.charAt(i);
				if (row == 0) {
					b = 0;
					row = 1;
				}
			}
		}

		String textoCrip = "";
		for (int i = 0; i < chave; i++) {
			for (int j = 0; j < mensagem.length(); j++) {
				textoCrip += rail[i][j];
//                System.out.print(rail[i][j]);
			}
//            System.out.println();
		}

		textoCrip = textoCrip.replaceAll("\\.", "");
		System.out.println("Encrypted Message: " + textoCrip);
	}
}
