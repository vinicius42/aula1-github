package While;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// 3 - Receba dois n�meros do usu�rio e imprima o maior valor informado.
		// Repetir enquanto o usu�rio n�o digitar 0
		double n1=1,n2=1;
		String resposta = "a";
		Scanner teclado = new Scanner (System.in);
		while(n1!=0 && n2!=0) {
			System.out.println("Informe o primeiro n�mero");
			n1 = teclado.nextDouble();
			System.out.println("Informe o segundo n�mero");
			n2 = teclado.nextDouble();
			if (n1>n2) {
				System.out.println("O maior n�mero informado entre os dois �:"+n1);
			}
			else {
				System.out.println("O maior n�mero informado entre os dois �:"+n2);
			}
		}

	}

}
