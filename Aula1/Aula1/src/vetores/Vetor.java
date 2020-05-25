package vetores;

public class Vetor {

	public static void main(String[] args) {
		// Criar um vetor de String com 10 elementos
		String[] vetor = new String[10];
		System.out.println(vetor.length); // Imprime o tamanho do vetor
		// Navegar (Iterar) em um vetor
		// Por elemento
		vetor[0] = "Teste";
		vetor[1] = "Abc";
		
		System.out.println(vetor[0]); // Imprime o elemento 0
		System.out.println(vetor[1]); // Imprime o elemento 1
		
		// Por laços de repetição: explorando o tamanho do vetor
		System.out.println("Inicio do for");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("Final do for\n");
		
		// Por laço de repetição: explorando os nulos
		// Enquanto o valor do elemento não for nulo, imprimir
		
		int j = 0;
		System.out.println("Inicio do while");
		while(vetor[j] != null) {
			System.out.println(vetor[j]);
			j++;
		}
		System.out.println("Final do while\n");


	}

}
