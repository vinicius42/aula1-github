package treinando;

public class Exercicio_10 {

	public static void main(String[] args) {
		double soma = 0, num = 1, den = 1, a = 1;
		for(int i = 0; i < 10; i++) {
			soma += (num * a) / den;
			num += 2;
			den ++;
		}
		System.out.println(soma);

	}

}
