package exercicio_1_secao8;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite o valor da largura e altura, respectivamente: ");
		retangulo.largura = leia.nextDouble();
		retangulo.altura = leia.nextDouble();
		
		System.out.println("�rea: " + retangulo.Area());
		System.out.println("Per�metro: " + retangulo.Perimetro());
		System.out.printf("Diagonal: " + retangulo.Diagonal());

	}

}
