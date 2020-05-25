package treinando;

public class Exercicio_11 {

	public static void main(String[] args) {
		double a, q;
		a = 1;
		q = 5;
		double prox = 0;
		
		for(int i = 0; i < 10; i++) {
			prox = a * q;
			a = prox;
			System.out.println(a);
		}

	}

}
