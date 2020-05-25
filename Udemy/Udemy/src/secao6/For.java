package secao6;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * int a = leia.nextInt(); int soma = 0;
		 * 
		 * for(int i = 0; i < a; i++) { int x = leia.nextInt(); soma += x; }
		 * 
		 * System.out.println(soma);
		 */

		// Ex.1
		/*
		 * int a = leia.nextInt(); for (int i = 1; i <= a; i++) { if(i % 2 != 0) {
		 * System.out.println(i); } }
		 */

		// Ex.2
		/*
		 * int n = leia.nextInt(); int in = 0; int out = 0;
		 * 
		 * for (int i = 0; i < n; i++) { int x = leia.nextInt(); if(x >= 10 && x <= 20)
		 * { in += 1; } else { out += 1; } } System.out.println("In: " + in);
		 * System.out.println("Out: " + out);
		 */

		// Ex.3
		/*
		 * int n = leia.nextInt(); double media = 0.0; for(int i = 0; i < n; i++) {
		 * double a = leia.nextDouble(); double b = leia.nextDouble(); double c =
		 * leia.nextDouble();
		 * 
		 * media = (a * 2.0 + b * 3.0 + c * 5.0)/10.0;
		 * 
		 * System.out.println(media); }
		 */

		// Ex.4
		/*
		 * int n = leia.nextInt(); double divisao = 0; for (int i = 0; i < n; i++) { int
		 * x = leia.nextInt(); int y = leia.nextInt(); if (y == 0) {
		 * System.out.println("Divisão impossível"); } else { divisao = (double) x / y;
		 * System.out.println(divisao); } }
		 */
		
		// Ex.5
		/*
		 * int n = leia.nextInt(); int fatorial = 1;
		 * 
		 * for(int i = 1; i <= n; i++) { fatorial *= i; System.out.println(fatorial); }
		 * 
		 * System.out.println(fatorial);
		 */
		
		// Ex.6
		/*
		 * int n = leia.nextInt(); for(int i = 1; i <= n; i++) { if(n % i == 0) {
		 * System.out.println(i); } }
		 */
		
		// Ex.7
		/*
		 * int n = leia.nextInt();
		 * 
		 * for (int i = 1; i <= n; i++) { //quadrado = Math.pow(i, 2); //cubo =
		 * Math.pow(i, 3); int primeiro = i; int quadrado = i * i; int cubo = i * i * i;
		 * System.out.printf("%d %d %d%n", primeiro, quadrado, cubo); }
		 */

		leia.close();

	}

}
