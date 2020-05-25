package Vetores;

public class Vetor_exemplo1 {

	public static void main(String[] args) {
		// Criar um vetor da String com 10 elementos
		String[] vetor = new String[10];
		System.out.println(vetor.length);// Imprimir o tamanho do vetor
		//Navegar (Iterar) em um vetor
		//Por elemento
		vetor[0] = "Teste";
		vetor[1] = "Abc";
		
		System.out.println(vetor[0]);// Imprimir o elemento 0
		System.out.println(vetor[1]);// Imprimir o elemento 1
		
		//Por laços de repetião: explorando o tamanho do vetor
		System.out.println("Ínicio do FOR");
		for(int i =0;i<vetor.length;i++) {
			System.out.println(vetor[i]);
			
		}
		System.out.println("FIM do FOR");
		//Por laços de repetião: explorando os nulos
		//Enquanto o valor do elemento não for nulo, imprimir
		int j = 0;
		System.out.println("Ínicio do WHILE");
		while(vetor[j]!=null) {
			System.out.println(vetor[j]);
			j++;
		}
		System.out.println("FIM do WHILE");
	}

}
