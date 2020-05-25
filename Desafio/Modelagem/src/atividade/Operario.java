package atividade;

public class Operario extends Empregado {
	public double valorProducao;
	public double comissao;
	
	public double calcularSalario() {
		return salarioBase - (salarioBase * imposto) + (valorProducao * comissao);
	}

}
