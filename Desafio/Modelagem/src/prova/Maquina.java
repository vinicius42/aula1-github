package prova;

import java.util.ArrayList;


public class Maquina {
	ArrayList<I_Produto> produto = new ArrayList<I_Produto>();

	public I_Produto EntregaProduto(String tipoproduto) {
		I_Produto produ = null;

		switch (tipoproduto) {
		case "Caf�":
			Cafe cafe = new Cafe();
			produ = cafe;
			break;
		case "Salgadinho":
			Salgadinho salgadinho = new Salgadinho();
			produ = salgadinho;
			break;
		case "Refrigerante":
			Refrigerante refri = new Refrigerante();
			produ = refri;
			break;

		default:
			break;
		}
		return produ;
	}

	public double CalcularTotal() {
		double total = 0.0;
		for (I_Produto prod : this.produto) {
			total += prod.preco();
		}
		return total;
	}

}
