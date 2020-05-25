package ExerciciosPedroHenriqueSilva;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// 3 - Qual é a soma dos 10 primeiros termos de uma sequencia cujos primeiros valores são {a,3a/2,...)?
		float i,n,c,l=1,k=1,t=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o primeiro valor:");
		n = teclado.nextInt();
		for(i=1;i<=9;i++) {
			l+=2;
			k+=1;
			c = (l*n)/k; // Faz os 9 calculos da sequencia		
			t+=c; // Vai somando os calculas em uma variavel
			c=0;
		}
		t+=n; // Finaliza somando as 10 sequencia com o valor que o usuario informou no comeco.
		System.out.println(t); // Mostra na tela qual a soma das 10 sequencias.

	}

}
