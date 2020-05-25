package exercicio_secao10;

import java.text.ParseException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws ParseException{
		Scanner leia = new Scanner(System.in);
		
		Quarto[] vetor = new Quarto[10];
		
		System.out.println("Quantos quartos serão alugados ?");
		int alugado = leia.nextInt();
		
		for (int i = 1; i <= alugado; i++) {
			System.out.println("Alugado #" + i);
			System.out.println("Nome: ");
			leia.nextLine();
			String nome = leia.nextLine();
			System.out.println("Email: ");	
			String email = leia.nextLine();
			System.out.println("Quarto: ");
			int quarto = leia.nextInt();
			vetor[quarto] = new Quarto(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if(vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		leia.close();

	}

}
