package exercicio_estatico;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o valor do d�lar ?");
		double dolar = leia.nextDouble();
		
		System.out.println("Quantos d�lares ser�o comprados ?");
		double compra = leia.nextDouble();
		
		double total = ConversorAtual.Calculo(dolar, compra);
		
		System.out.println("Quantidade a ser pago em reais: " + total);

	}

}
