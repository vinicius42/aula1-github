package secao5;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor = leia.nextInt();
		String dia;
		
		switch (valor) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;

		default:
			dia = "Dia inválido";
			break;
		}
		System.out.println(dia);

	}

}
