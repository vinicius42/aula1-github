package controle_de_fluxo;

import java.util.Scanner;

public class xupaxzao {

	public static void main(String[] args) {
		float x,y,a;
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe o valor de X:");
		x = tec.nextFloat();
		System.out.println("O valor de X é: " + x);
		System.out.println("Informe o valor de Y:");
		y = tec.nextFloat();
		System.out.println("O valor de Y é: " + y);
		System.out.println(" TUTS TUTS, invertendo os valores");
		a=y;
		y=x;
		x=a;
		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de Y é: " + y);

	}

}
