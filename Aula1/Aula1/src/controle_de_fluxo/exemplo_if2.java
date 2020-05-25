package controle_de_fluxo;

import java.util.Scanner;

public class exemplo_if2 {

	public static void main(String[] args) {
		/*
		Receber = idade do usario
		Se a idade for menor que 18, imprimir Menor de Idade
		Se for maior ou igual a 18, imprimir Maior de Idade
		Se for maior que 65, imprimir Idoso
		*/
		
		Scanner teclado = new Scanner(System.in);
		int idade = 0;
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		if(idade < 18) {
			System.out.println("Menor de idade !");
		}
		else {
			if(idade >= 65) {
				System.out.println("Idoso");
			}
			else {
				System.out.println("Maior de idade");
			}
		}
	}

}
