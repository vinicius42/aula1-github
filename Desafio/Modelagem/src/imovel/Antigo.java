package imovel;

public class Antigo extends Imovel {
	public String QualidadeImovel = "Antigo";

	public double Taxa(double taxa1) {
		if (this.QualidadeImovel == "Antigo") {
			preco = preco - (preco * taxa);
			juros = preco * 0.1;
			valor = preco + (juros * (84 / 12));
		}
		return this.valor;

	}

}
