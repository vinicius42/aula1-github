package empresa;

public class Gerente extends Funcionario {
	public String NivelGerencial = "Gerente_1";
	
	@Override
	public double CalcularBonificacao(double bonus) {
		if(this.NivelGerencial == "Gerente_3") {
			bonus = bonus + 0.02; // Adiciona 2% ao bonus concedido
		}
		return this.Salario * bonus;
	}

}
