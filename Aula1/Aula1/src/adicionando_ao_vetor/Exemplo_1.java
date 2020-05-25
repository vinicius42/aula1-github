package adicionando_ao_vetor;

import java.util.ArrayList;

public class Exemplo_1 {

	public static void main(String[] args) {
		String chave = "Ana";
		
		
		// Cria��o e carga de dados para vetores
		String[] v_nomes = {"Ana", "Jo�o", "Antonia"};
		// Navegar nos objetos do vetor
		for(int i = 0; i < v_nomes.length;i++) {
			System.out.println(v_nomes[i]);
		}
		
		// Localizar a chave no vetor
		for(int i = 0; i < v_nomes.length; i++) {
			if(i < v_nomes.length && v_nomes[i].equalsIgnoreCase(chave)) {
				System.out.println("O nome foi encontrado!: " + v_nomes[i]);
				System.out.println("A posi��o em que se encontra o nome �: " + i);
				break;
			}
		}
		
		
		// Cria��o e carga de dados para ArrayList
		ArrayList<String> l_nomes = new ArrayList<String>();
		l_nomes.add("Ana");
		l_nomes.add("Jo�o");
		l_nomes.add("Antonia");
		l_nomes.add("XYZ");
		
		// Navegar nos objetos da lista
		System.out.println("Navegando na lista");
		for(int i = 0; i < l_nomes.size();i++) {
			System.out.println(l_nomes.get(i));
		}
		
		l_nomes.remove(2);
		System.out.println("\nna lista ap�s remover");
		for(int i = 0; i < l_nomes.size();i++) {
			System.out.println(l_nomes.get(i));
		}
		System.out.println(l_nomes.contains(chave)?"Encontrado " + l_nomes.indexOf(chave):"N�o encontrado");

	}

}
