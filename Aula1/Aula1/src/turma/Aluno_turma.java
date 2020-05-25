package turma;

import java.util.Scanner;

public class Aluno_turma {

	public static void main(String[] args) {
		 Turma turma = new Turma();
		 
		 String resp = "s";
		 Scanner teclado = new Scanner(System.in);
		 while(resp.equalsIgnoreCase("s")) {
			 System.out.println("Informe a matricula: ");
			 Aluno aluno = new Aluno(teclado.next());
			 teclado = new Scanner(System.in);
			 System.out.println("Informe o CPF: ");
			 aluno.cpf = teclado.nextLine();
			 teclado = new Scanner(System.in);
			 System.out.println("Informe o seu nome: ");
			 aluno.nome = teclado.nextLine();
			 turma.aluno.add(aluno);
			 System.out.println("Continuar ? (s/n)");
			 resp = teclado.next();
			 teclado = new Scanner(System.in);
			 
		 }
		 for(Aluno t : turma.aluno) {
			 t.Salvar();
		 }

	}

}
