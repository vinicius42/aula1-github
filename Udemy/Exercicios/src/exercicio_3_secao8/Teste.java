package exercicio_3_secao8;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o seu nome: ");
		aluno.nome = leia.nextLine();
		
		System.out.println();
		System.out.println("Digite suas notas: ");
		aluno.nota1 = leia.nextDouble();
		aluno.nota2 = leia.nextDouble();
		aluno.nota3 = leia.nextDouble();
		
		if(aluno.NotaFinal() > 60.0) {
			System.out.println("M�dia final: " + aluno.NotaFinal());
			System.out.println("Aprovado");
		}
		else {
			System.out.println("M�dia final: " + aluno.NotaFinal());
			System.out.println("Reprovado");
			System.out.println("Faltou " + aluno.PontosMinimos() + " pontos.");
		}
		

	}

}
