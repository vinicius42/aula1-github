package While;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2 - Com a mesma classe do programa anterior, continue a repetir enquanto o 
		// usu�rio solicitar e a idade dele n�o for menor que 10
				int idade=11;
				Scanner teclado = new Scanner (System.in);
				String resposta = "s";
				while(resposta.equalsIgnoreCase("s")&& idade>10) {
					System.out.println("Informe a sua idade");
					idade = teclado.nextInt();
					if (idade>=18) {
						System.out.println("Voc� � maior de idade");
					}
					else {
						System.out.println("Voc� � menor de idade");
					}
					System.out.println("Deseja conferir outra pessoa? (s/n)");
					resposta = teclado.next();
				}

	}

}
