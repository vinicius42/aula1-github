package controle_de_fluxo;

import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		//Criação de objetos
		float x,y;
		Scanner tec = new Scanner(System.in);
		
		// Entrada dos dados pelo usuário
		System.out.println("X:");
		x = tec.nextFloat();
		System.out.println("Y:");
		y = tec.nextFloat();
		
		//Regra de processamento
		if(x>0 && (Math.pow(x, 2)+Math.pow(y, 2))<1) {
			System.out.println("O ponto (" + x + ", "+y+") pertence a H");
		}
		else {
			System.out.println("O ponto (" + x + ", "+y+") não pertence a H");
		}

	}

}
