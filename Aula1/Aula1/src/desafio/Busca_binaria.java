package desafio;

import java.util.Scanner;

public class Busca_binaria {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String v[] = {"Davi" , "Arthur" , "Pedro" , "Gabriel" , "Bernardo" , "Lucas" , "Matheus" , "Rafael" , "Heitor" , "Enzo" , "Guilherme" , "Nicolas" , "Lorenzo" , "Gustavo" , "Felipe" , "Samuel" , "João Pedro" , "Daniel" , "Vitor" , "Leonardo" , "Henrique" , "Theo" , "Murilo" , "Eduardo" , "Pedro Henrique" , "Pietro" , "Cauã" , "Isaac" , "Caio" , "Vinicius" , "Benjamin" , "João" , "Lucca" , "João Miguel" , "Bryan" , "Joaquim" , "João Vitor" , "Thiago" , "Antônio" , "Davi Lucas" , "Francisco" , "Enzo Gabriel" , "Bruno" , "Emanuel" , "João Gabriel" , "Ian" , "Davi Luiz" , "Rodrigo" , "Otávio" , "Alice" , "Julia" , "Isabella" , "Manuela" , "Laura" , "Luiza" , "Valentina" , "Giovanna" , "Maria Eduarda" , "Helena" , "Beatriz" , "Maria Luiza" , "Lara" , "Mariana" , "Nicole" , "Rafaela" , "Heloísa" , "Isadora" , "Lívia" , "Maria Clara" , "Ana Clara" , "Lorena" , "Gabriela" , "Yasmin" , "Isabelly" , "Sarah" , "Ana Julia" , "Letícia" , "Ana Luiza" , "Melissa" , "Marina" , "Clara" , "Cecília" , "Esther" , "Emanuelly" , "Rebeca" , "Ana Beatriz" , "Lavínia" , "Vitória" , "Bianca" , "Catarina" , "Larissa" , "Maria Fernanda" , "Fernanda" , "Amanda" , "Alícia" , "Carolina" , "Agatha" , "Gabrielly"};
		int inicio, meio, fim;
		int resultado = -1;
		int i;
		String aux;
		String buscar;
		
		
		inicio = 0;
		fim = v.length - 1;
		
		for(i = 0; i<v.length; i++){
	        for(int j = 0; j<v.length - 1; j++){
	            if(v[j].compareToIgnoreCase(v[j + 1]) > 0){
	                aux = v[j];
	                v[j] = v[j+1];
	                v[j+1] = aux;
	            }
	        }
	    }
		
		
		System.out.println("Informe um nome que deseja procurar: ");
		buscar = teclado.next();
		
		
		while(inicio <= fim) {
			meio = (inicio + fim)/2;
			if(v[meio].equalsIgnoreCase(buscar)) {
				resultado = meio;
			}
			if(v[meio].compareToIgnoreCase(buscar) < 0) {
				inicio = meio + 1;
			}
			else {
				fim = meio - 1;
			}
		}
		System.out.println(resultado);
		
		
		

	}

}
