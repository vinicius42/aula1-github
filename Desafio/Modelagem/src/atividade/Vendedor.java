package atividade;

public class Vendedor extends Empregado {
	public double valorVendas;
	public double comissao;
	
	public double calcularSalario() {
		return salarioBase - (salarioBase * imposto) + (valorVendas * comissao);
	}

}
