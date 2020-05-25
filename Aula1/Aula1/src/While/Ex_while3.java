package While;

import java.util.Scanner;

public class Ex_while3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1 = 1;
		int num2 = 1;
		
		while(num1 != 0 && num2 != 0) {
			System.out.println("Informe um valor: ");
			num1 = teclado.nextInt();
			
			System.out.println("Informe outro valor: ");
			num2 = teclado.nextInt();
			
			if(num1 > num2) {
				System.out.println("O maior valor informado é: " + num1);
			}else {
				System.out.println("O maior valor informado é: " + num2);
			}
			System.out.println("Fim");
		}
	}

}
