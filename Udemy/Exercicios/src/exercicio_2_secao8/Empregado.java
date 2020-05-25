package exercicio_2_secao8;

public class Empregado {
	public String nome = "";
	public double salario = 0.0;
	public double imposto = 0.0;
	
	public double SalarioLiquido () {
		return salario - imposto;
	}
	
	public void AumentoSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome + ", $" + String.format("%.2f", SalarioLiquido());
	}

}