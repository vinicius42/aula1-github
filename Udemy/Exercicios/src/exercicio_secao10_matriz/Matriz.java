package exercicio_secao10_matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int m = leia.nextInt();	// N�mero de colunas
		int n = leia.nextInt(); // N�mero de linhas
		int[][] matriz = new int[m][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = leia.nextInt();
			}
		}
		
		int x = leia.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Posi��o " + i + "," + j + ":");
					if (j > 0) { // Esquerda tem a coluna
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {// Em cima tem uma linha
						System.out.println("Up: " + matriz[i-1][j]); 
					}
					if (j < matriz[i].length - 1) { // Direita
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length - 1) { // Embaixo
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}

	}

}
