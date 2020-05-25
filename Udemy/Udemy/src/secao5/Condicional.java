package secao5;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//System.out.println("Digite um valor: ");
		
		// Par e impar
		/*
		 * int x = leia.nextInt(); if(x % 2 == 0) { System.out.println("Par"); } else {
		 * System.out.println("Impar"); }
		 */
		
		// Multiplos
		/*
		 * int a = leia.nextInt(); int b = leia.nextInt();
		 * 
		 * if(a % b == 0 || b % a == 0) { System.out.println("São multiplos"); } else {
		 * System.out.println("Não são multiplos"); }
		 */
		
		// Hora
		/*
		 * int horainicial = leia.nextInt(); int horafinal = leia.nextInt(); int
		 * resultado;
		 * 
		 * if(horainicial < horafinal) { resultado = horafinal - horainicial;
		 * System.out.println(resultado); } else { resultado = 24 - horainicial +
		 * horafinal; System.out.println(resultado); } leia.close();
		 */
		
		//Ex. 5
		/*
		 * System.out.println("Digite o código de um item: "); int a = leia.nextInt();
		 * System.out.println("Informe a quantidade: "); int b = leia.nextInt(); double
		 * total = 0;
		 * 
		 * if(a == 1) { total = b * 4.0; } else if(a == 2) { total = b * 4.5; } else
		 * if(a == 3) { total = b * 5.0; } else if(a == 4) { total = b * 2.0; } else
		 * if(a == 5) { total = b * 1.5; }
		 * 
		 * System.out.println(total);
		 */
		
		// Ex.6
		/*
		 * double a = leia.nextDouble(); if(a < 0 || a > 100) {
		 * System.out.println("Fora do intervalo"); } else if (a <= 25) {
		 * System.out.println("Intervalo (0,25]"); } else if (a <= 50) {
		 * System.out.println("Intervalo (25,50]"); } else if (a <= 75) {
		 * System.out.println("Intervalo (50,75]"); } else {
		 * System.out.println("Intervalo 75,100]"); }
		 */
		
		// Ex.7
		/*
		 * double x = leia.nextDouble(); double y = leia.nextDouble();
		 * 
		 * if(x == 0.0 && y == 0.0) { System.out.println("Origem"); } else if(y == 0.0)
		 * { System.out.println("Está no eixo Y"); } else if(x == 0.0) {
		 * System.out.println("Está no eixo X"); } else if(x > 0.0 && y > 0.0) {
		 * System.out.println("Q1"); } else if(x < 0.0 && y > 0.0) {
		 * System.out.println("Q2"); } else if(x < 0.0 && y < 0.0) {
		 * System.out.println("Q3"); } else { System.out.println("Q4"); }
		 */
		
		// Ex.8
		/*
		 * double a = leia.nextDouble(); double imposto; if(a <= 2000.0) { imposto =
		 * 0.0; } else if(a <= 3000.0) { imposto = (a - 3000.0) * 0.18 + 1000.0 * 0.08;
		 * } else if (a <= 4500.0) { imposto = (a - 3000.0) * 0.18 + 1000.0 * 0.08; }
		 * else { imposto = (a - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; }
		 * 
		 * if (imposto == 0.0) { System.out.println("Isento"); } else {
		 * System.out.printf("R$ %.2f%n", imposto); } leia.close();
		 */
		
		// Minutos
		/*
		 * int minutos = leia.nextInt(); double conta = 50.0;
		 * 
		 * if(minutos > 100) { conta += (minutos - 100) * 2.0; }
		 * System.out.println(conta);
		 */
		
		// Ternária
		// (condicao) ? valor_se_verdadeiro : valor_se_falso
		double preco = leia.nextDouble();
		double desconto = (preco < 20.0) ? preco *0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
