package imovel;

public class Usado extends Imovel {
	public String QualidadeImovel = "Usado";

	
	public double Taxa(double taxa1) {
		juros = preco * 0.09;
		valor = preco + (juros * (180 / 12));
		return valor;

	}

}
