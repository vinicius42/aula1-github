package treinando;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int alunos;
		int soma = 0;
		int maior = 0, menor = 0;
		
		System.out.println("Informe quantos alunos há na turma: ");
		alunos = teclado.nextInt();
		
		int[] nota = new int[alunos];
		String[] nome = new String[alunos];
		
		for(int i = 0; i < nota.length; i++) {
			System.out.println("Informe a nota do " + (i + 1) + "°" + " aluno: ");
			nota[i] = teclado.nextInt();
			if(nota[i] > nota[maior]) {
				maior = i;
			}
			else {
				menor = i;
			}
			teclado = null;
			teclado = new Scanner(System.in);
			System.out.println("Informe o nome do " + (i + 1) + "°" + " aluno: ");
			nome[i] = teclado.nextLine();
		}
		for(int i = 0; i < nota.length; i++) {
			System.out.println("O aluno " + nome[i] + " tirou " + nota[i] + " na prova");
			System.out.println("O aluno " + nome[i] + " teve a maior nota da turma: " + nota[maior]);
			System.out.println("O aluno " + nome[i] + " teve a menor nota da turma: " + nota[menor]);
		}
		double media = soma/alunos;
		
		

	}

}
