package controle_de_fluxo;

import java.util.Scanner;

public class par_ou_impar {

	public static void main(String[] args) {
		int x;
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe o valor de X:");
		x = tec.nextInt();
		// OPERAÇÕES MATEMÁTICAS BÁSICAS
		System.out.println(x+2);//Adição
		System.out.println(x-2);//Subtração
		System.out.println(x*2);//Multiplicação
		System.out.println(x/2);//Divisão
		System.out.println(Math.pow(x, 2));//Potência
		System.out.println(Math.sqrt(4));//Radiciação
		System.out.println(Math.log10(100));//Logaritmo de base 10
		System.out.println(Math.log(8));//Logaritmo de base 2
		System.out.println(x%2);//Resto da divisão
		
		if (x%2==0) {
			System.out.println("O número é PAR");
		}
		else {
			System.out.println("O número é ÍMPAR");
		}

	}

}
