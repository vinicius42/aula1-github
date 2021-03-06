package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		// Na lista voc� vai add ou removendo elementos conforme necessidade, diferente do vetor
		// Lista inicia vazia
		
		List<String> list = new ArrayList<>(); // Lista n�o acc tipos primitivos, n�o posso colocar o "int".
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size()); // Tamanho da lista
		
		for (String x : list) {
			System.out.println(x);
		}
		
		// Remover
		list.remove("Marco");
		
		// Pega um valor x do tipo "String" e me retorna se esse char.At � igual a M
		list.removeIf(x -> x.charAt(0) == 'M');
		
		// Posi��o de um elemento
		list.indexOf("Bob");
		// Obs: Quando ele n�o encontra um elemento ele retorna -1
		
		
		// Filtrar lista
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
			// Stream: faz com que acc opera��es lambda, por�m n�o � compat�vel com o list
			// Collectors: faz com que convarta para lista. Voltar para lista
		
		// Filtrar escolhendo o elemento
		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
			// findFirst procura pelo primeiro elemento passado pelo l�mbda

	}

}
