package exercicio_3_secao8;

public class Aluno {
	public String nome = "";
	public double nota1 = 0.0;
	public double nota2 = 0.0;
	public double nota3 = 0.0;
	
	public double NotaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double PontosMinimos() {
		if(NotaFinal() < 60.0) {
			return 60.0 - NotaFinal();
		}
		else {
			return 0.0;
		}
	}

}
