package controle_de_fluxo;

import java.util.Scanner;

public class par_ou_impar {

	public static void main(String[] args) {
		int x;
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe o valor de X:");
		x = tec.nextInt();
		// OPERA��ES MATEM�TICAS B�SICAS
		System.out.println(x+2);//Adi��o
		System.out.println(x-2);//Subtra��o
		System.out.println(x*2);//Multiplica��o
		System.out.println(x/2);//Divis�o
		System.out.println(Math.pow(x, 2));//Pot�ncia
		System.out.println(Math.sqrt(4));//Radicia��o
		System.out.println(Math.log10(100));//Logaritmo de base 10
		System.out.println(Math.log(8));//Logaritmo de base 2
		System.out.println(x%2);//Resto da divis�o
		
		if (x%2==0) {
			System.out.println("O n�mero � PAR");
		}
		else {
			System.out.println("O n�mero � �MPAR");
		}

	}

}
