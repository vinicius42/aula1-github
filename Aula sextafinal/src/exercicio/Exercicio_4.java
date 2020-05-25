package exercicio;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String nomes;
		String nome [] = {"Mystique", "Jean Gray", "Beast", "Logan", "Xavier"};
		
		System.out.println("Informe um nome a procurar: ");
		nomes = teclado.next();
		
		for(int i = 0; i < nome.length; i++) {
			if(nomes.equalsIgnoreCase(nome[i])) {
				System.out.println("O nome foi encotrado");
				break;
			}
		}
		

	}

}
