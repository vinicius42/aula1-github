package atividade_UniLe;

public class Teste {

	public static void main(String[] args) {
		Graduacao grad = new Graduacao();
		Especializacao espec = new Especializacao();
		
		grad.aluno = "Jos�";
		grad.Notas.add(8.0);
		grad.Notas.add(7.0);
		grad.Notas.add(6.5);
		
		System.out.println("O aluno " + grad.aluno + " est�: " + grad.MediaNotas());
		
		espec.aluno = "Carlos";
		espec.Competencia.add("sim");
		
		System.out.println("O aluno " + espec.aluno + " est�: " + espec.MediaNotas());
		

	}

}
