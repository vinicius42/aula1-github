package busca_binaria;

import java.util.Scanner;

public class Exemplo_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v[] = {20, 30, 25, 84, 56, 12, 1, 69, 78} ;
		int aux;
		int inicio;
		int fim;
		int meio;
		int resultado = -1;
		int buscar;
		inicio = 0;
		fim = v.length - 1;
		
		for(int i = 0; i<v.length; i++){
	        for(int j = 0; j<v.length - 1; j++){
	            if(v[j] > v[j + 1]){
	                aux = v[j];
	                v[j] = v[j+1];
	                v[j+1] = aux;
	            }
	        }
	    }
		System.out.println("Vetor organizado:");
	    for(int i = 0; i<v.length; i++){
	        System.out.println(v[i]);
	    }
		System.out.println("Informe um valor a ser procurado: ");
		buscar = teclado.nextInt();
		
		while(inicio <= fim) {
			meio = (inicio + fim)/2;
			if(v[meio] == buscar) {
				resultado = meio;
			}
			if(v[meio] < buscar) {
				inicio = meio + 1;
			}
			else {
				fim = meio -1;
			}
		}
		System.out.println(resultado);
	}

}
