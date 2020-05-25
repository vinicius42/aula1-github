package processar_textos;

import java.util.ArrayList;

public class Exemplo_1 {

	public static void main(String[] args) {
		// Possuir duas listas
		// Uma lista de destinos
		// Outra lista de exceções (black list)
		String destinos = "Miami,Fort Lauderdale,Los Angeles,Las Vegas,Dubai,Vancouver,Montreal,Barcelona,Amsterdan";
		String exception = "Amsterdan,Las Vegas,Miami";
		// Carregar os dados em duas listas
		ArrayList<String> l_destinos = new ArrayList<String>();
		ArrayList<String> l_exception = new ArrayList<String>();
		
		for(String s : destinos.split(",")) {
			l_destinos.add(s);
		}
		for(String s : exception.split(",")) {
			l_exception.add(s);
		}
		// Imprimir os destinos que não possuem exceção
		for(String d : l_destinos) {
			if(!l_exception.contains(d)) {
				System.out.println(d);
			}
		}

	}

}
