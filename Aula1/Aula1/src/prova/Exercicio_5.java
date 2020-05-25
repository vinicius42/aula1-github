package prova;

import java.util.ArrayList;

public class Exercicio_5 {

	public static void main(String[] args) {
		int[] vetor = {99,5,1,4,9,12,3,2,8,7,6,15};
		boolean x;
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();
		
		for(int i = 0; i < vetor.length; i++) {
			x = (vetor[i] % 2 == 0) ? par.add(vetor[i]) : impar.add(vetor[i]);
		}
		
		System.out.println("Números pares: ");
		for(int i = 0; i < par.size(); i++) {
			System.out.println(par.get(i));
		}
		System.out.println("Números ímpares: ");
		for(int i = 0; i < impar.size(); i++) {
			System.out.println(impar.get(i));
		}

	}

}
