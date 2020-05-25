package exercicio;

public class Exercicio_5 {

	public static void main(String[] args) {
		for(int i = 10; i >= 1; i--) {
			System.out.println("\n" + i);
			for(int j = i - 1 ; j > 0; j--) {
				System.out.print("\t" + j);
			}
		}

	}

}
