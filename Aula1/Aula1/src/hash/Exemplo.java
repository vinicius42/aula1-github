package hash;

import java.util.HashMap;

import java.util.Map.Entry;

public class Exemplo {

	public static void main(String[] args) {
		HashMap<String, Integer> tabela = new HashMap<String, Integer>();
		String texto = "Este é um texto sobre o uso de um elemento para processamento de texto";
		int total = 0;
		for(String s : texto.split(" ")) {
			if(tabela.get(s) != null) {// A chave s foi encontrada na tabela Hash
				tabela.put(s, tabela.get(s) + 1);// Get retorna o valor
				total += 1;
			}
			else {// A chave não existe e deve ser inserida
				tabela.put(s, 1);
				total += 1;
			}
		}
		
		// Mostrar o conteúdo da tabela hash
		for(Entry<String, Integer> entry : tabela.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println(total);

	}

}
