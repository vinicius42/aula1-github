package imovel;

public class Novo extends Imovel {
	public String QualidadeImovel = "Novo";
	
	
	public double Taxa(double taxa1) {
		if(this.QualidadeImovel == "Novo") {
			preco = preco + (preco * taxa);
			juros = preco * 0.08;
			valor = preco + (juros * (180 / 12));
		}
		return this.valor;

	}


}
