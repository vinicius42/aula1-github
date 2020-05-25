package While;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// 4 - Pergunte quantos alunos há em uma turma. 
		// Receba uma nota para cada aluno e, ao final, imprima a média da turma
		double qtaluno=0,nota=0,soma=0,contador=0;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Informe quantos alunos tem na sala:");
		qtaluno = teclado.nextInt();
		while(contador<qtaluno) {
			System.out.println("Informe a nota de um aluno");
			contador+=1;
			nota= teclado.nextDouble();
			soma+= nota;
		}
		System.out.println("A média da turma é:"+soma/qtaluno);
	}

}
