package atividade_UniLe;

public class Especializacao extends Aluno{
	public boolean competencia = true;
	
	public String MediaNotas() {
		for(String i : this.Competencia) {
			if(!i.equalsIgnoreCase("sim")) {
				competencia = false;
			}
		}
		if(competencia == true) {
			return "Aprovado";
		}
		else {
			return "Reprovado";
		}
	}

}
