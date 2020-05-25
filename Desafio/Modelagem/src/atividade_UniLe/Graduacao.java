package atividade_UniLe;

public class Graduacao extends Aluno {

	public String MediaNotas() {
		double total = 0.0;
		for(Double i : this.Notas) {
			total += i;
		}
		if(total / this.Notas.size() >= 8.0) {
			return "Aprovado";
		}
		else {
			return "Reprovado";
		}
	}
	
	
	

}
