package exercicio;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		int n[] = {9,7,8,4,6,1,3,5,2,0};
		int valor;
		int retorno = -1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor que você quer buscar: ");
		valor = teclado.nextInt();
		
		for(int i = 0; i < n.length; i++) {
			if(valor == n[i]) {
				System.out.println("O valor se encontra na posição " + i);
				break;
			}
			if(i == 9 && retorno != n.length) {
				System.out.println("-1");
			}
		}
		

	}

}
