package treinando;

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 5;
		int m = 0;
		String aux;
		String x;
		String[] v = {"Mystique","Jean Grey","Beast","Logan","Xavier"};
		
		for(int i = 0; i < v.length; i++) {
			for(int j = 0; j < v.length - 1; j++) {
				if(v[j].compareToIgnoreCase(v[j + 1]) > 0) {
					aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
		
		System.out.println("Vetor organizado: ");
	    for(int i = 0; i<v.length; i++){
	        System.out.println(v[i]);
	    }
		
		System.out.println("Informe o nome a ser procurado: ");
		x = teclado.next();
		
		while(m < n && v[m].compareToIgnoreCase(x) < 0) {
			m += 1;
			if(m < n && v[m].equalsIgnoreCase(x)) {
				System.out.println("O nome se encontra na posição: " + m);
			}
		}

	}

}
