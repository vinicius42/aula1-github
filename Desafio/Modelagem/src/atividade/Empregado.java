package atividade;

public class Empregado extends Pessoa{
	public int codigoSetor;
	public double salarioBase;
	public double imposto;
	
	public double calcularSalario() {
		return salarioBase - (salarioBase * imposto);
	}

}
