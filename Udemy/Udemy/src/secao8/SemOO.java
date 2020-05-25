package secao8;

import java.util.Locale;
import java.util.Scanner;

public class SemOO {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo(); // Instanciação
		
		System.out.println("Enter the measure(medidas) of triangle X: ");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();
		
		System.out.println("Enter the measure(medidas) of triangle Y: ");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();
		
		double areaX = x.Area();
		
		double areaY = y.Area();
		
		System.out.printf("Triangle X area: %4f%n", areaX);
		System.out.printf("Triangle X area: %4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: " + areaX);
		}
		else {
			System.out.println("Maior área: " + areaY);
		}

	}

}
