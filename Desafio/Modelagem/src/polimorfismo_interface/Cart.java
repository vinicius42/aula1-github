package polimorfismo_interface;

import java.util.ArrayList;

public class Cart {
	ArrayList<I_item> Itens = new ArrayList<I_item>(); 
	// Coloca a interface (I_item) na assinatura do ArrayList, para receber as diferentes classes
	
	public double CalcularTotal() {
		double total = 0.0; // A variável total vai receber o valor de cada item
		// O for serve para navegar na lista de itens e executar o CalcularPreco de cada item
		for(I_item item : this.Itens) { // Eu uso a interface para percorrer nos itens
			// O for usa a interface, pra ele receber os diferentes itens
			total += item.CalcularPreco();
			
		}
		return total;
	}

}
