package While;

import java.util.Scanner;

public class Ex_while4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int aluno;
		double media = 0, aux = 0;
		int nota = 0;
		int i = 0;
		int soma = 0;
		
		System.out.println("Informe quantos alunos possue na turma: ");
		aluno = teclado.nextInt();
		
		while(i < aluno) {
			System.out.println("Informe a nota do aluno: ");
			aux = teclado.nextDouble();
			i += 1;
			soma += aux;
			media = soma/aluno;
		}
		System.out.println("A média da turma é: " + media);

	}

}
