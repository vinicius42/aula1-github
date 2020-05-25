package prova;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v[] = {99,5,1,4,9,12,3,2,8,7,6,15};
		int inicio, meio, fim;
		int resultado = 0;
		int buscar;
		int aux;		
		
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
		for(int i = 0; i < v.length; i++){
	        System.out.println(v[i]);
	    }
		
		inicio = 0;
		fim = v.length - 1;
		
		System.out.println("Informe um valor para ser buscado: ");
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
				fim = meio - 1;
			}
		}
		System.out.println("O valor se encontra na posição: " + resultado);
	}

}
