package atividade;

public class Fornecedor extends Pessoa{
	public int valorCredito;
	public int valorDivida;
	
	public int obterSaldo() {
		return valorCredito - valorDivida;
	}
}
