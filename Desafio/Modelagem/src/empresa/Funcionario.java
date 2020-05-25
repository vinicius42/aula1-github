package empresa;

public class Funcionario {
	public String cpf = "";
	public String nome = "";
	public double Salario = 0.0;
	public void contratar() {}
	public void dispensar() {}
	public double CalcularBonificacao(double bonus) {
		return this.Salario * bonus;
	}

}
