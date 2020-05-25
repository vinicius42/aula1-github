package treinando;

public class Exercicio_19 {

	public static void main(String[] args) {
		int n = 10, // Total de elementos no vetor
		m = 0, // Índice do elemento a ser avaliado
		x = 14; // Valor Buscado
		int vetor[] = {4,6,8,10,12,14,16,18};
		
		while(m < n && vetor[m] < x) {
			m += 1;
			if(m < n && vetor[m] == x) {
				System.out.println("O valor se encontra na posição: " + m);
			}
		}
		System.out.println("Fim");


	}

}
