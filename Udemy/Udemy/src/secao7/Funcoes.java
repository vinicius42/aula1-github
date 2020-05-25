package secao7;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Enter three numbers : ");
		
		int a = leia.nextInt();
		int b = leia.nextInt();
		int c = leia.nextInt();
		
		int maior = max(a, b, c);
		
		MostrarResultado(maior);
		
		leia.close();
	}
	// Static: Possa ser criada independente que seja criado um objeto
	public static int max(int x, int y, int z) {// Assim que se declara uma função
		int aux;
		if(x > y && x > z) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void MostrarResultado(int a) {
		System.out.println("Maior = " + a);
	}

}
