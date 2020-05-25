package secao6;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * int a = leia.nextInt(); int soma = 0;
		 * 
		 * while(a != 0) { soma += a; a = leia.nextInt(); }
		 * 
		 * System.out.println(soma);
		 * 
		 * 
		 * leia.close();
		 */
		
		// Ex.1
		/*
		 * int a = leia.nextInt(); while (a != 2002) {
		 * System.out.println("Senha inválida"); a = leia.nextInt(); }
		 * System.out.println("Acesso permitido");
		 */
		
		// Ex.2
		/*
		 * int x = leia.nextInt(); int y = leia.nextInt();
		 * 
		 * while(x != 0 && y != 0) { if(x > 0 && y > 0) { System.out.println("Q1"); }
		 * else if(x < 0 && y > 0) { System.out.println("Q2"); } else if(x < 0 && y < 0)
		 * { System.out.println("Q3"); } else { System.out.println("Q4"); } x =
		 * leia.nextInt(); y = leia.nextInt(); } leia.close();
		 */
		
		// Ex.3
		/*
		 * int a = leia.nextInt(); int alcool = 0, gasolina = 0, diesel = 0; while(a !=
		 * 4) { if(a == 1) { alcool += 1; } else if(a == 2) { gasolina += 1; } else if(a
		 * == 3) { diesel += 1; } else if(a < 1 || a > 4) {
		 * System.out.println("Código inválido, favor digitar novamente"); }
		 * 
		 * a = leia.nextInt(); }
		 * 
		 * System.out.println("Muito Obrigado!"); System.out.println("Álcool: " +
		 * alcool); System.out.println("Gasolina: " + gasolina);
		 * System.out.println("Diesel: " + diesel);
		 * 
		 * leia.close();
		 */

	}

}
