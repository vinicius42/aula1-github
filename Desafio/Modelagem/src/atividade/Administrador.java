package atividade;

public class Administrador extends Empregado{
	public double ajudaDeCusto;	
	
	public double calcularSalario() {
		return salarioBase - (salarioBase * imposto) + ajudaDeCusto;
	}

}
