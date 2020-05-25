package controle_de_fluxo;

public class primeiroexemplofor {

	public static void main(String[] args) {
		// Imprimir os números de 0 a 1000 - APENAS IMPARES
		int j;
		for(j = 0; j < 1000;j++) {
			if (j%2==0) {
			}
			else {
				System.out.println(j);
			}
			
		}
		System.out.println("O último valor de j é:" + j);
		
		
		// Imprimir os números de 0 a 1000 - APENAS IMPARES
		int k;
		for(k = 0; k < 1000;k+=2) {
			System.out.println(k);
			
		}
		System.out.println("O último valor de j é:" + k);
	}

}
