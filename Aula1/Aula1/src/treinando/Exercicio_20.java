package treinando;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 10; // Total de elementos do vetor
		int m = 0; // Índice do elemento a ser avaliado
		int x; // Número a ser procurado
		int aux;
		int v[] = {9,7,8,4,6,1,3,5,2,0};
		
		for(int i = 0; i < v.length; i++){
	        for(int j = 0; j < v.length - 1; j++){
	            if(v[j] > v[j + 1]){
	                aux = v[j];
	                v[j] = v[j+1];
	                v[j+1] = aux;
	            }
	        }
	    }
		
		System.out.println("Vetor organizado: ");
	    for(int i = 0; i<v.length; i++){
	        System.out.println(v[i]);
	    }

		
		System.out.println("Informe um valor a ser procurado: ");
		x = teclado.nextInt();
		
		while(m < n && v[m] < x) {
			m += 1;
			if(m < n && v[m] == x) {
				System.out.println("O valor se encontra na posição: " + m);
			}
		}

	}

}
