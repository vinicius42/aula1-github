package treinando;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int alunos;
		int i = 1;
		double soma = 0;
		double media = 0, aux = 0;
		
		System.out.println("Informe quantos alunos há na turma: ");
		alunos = teclado.nextInt();
		
		while(i <= alunos) {
			System.out.println("Informe a nota do " + i + "°" + " aluno: ");
			aux = teclado.nextDouble();
			i += 1;
			soma += aux;
			media = soma/alunos;
		}
		System.out.println("A média da turma é: " + media);

	}

}
