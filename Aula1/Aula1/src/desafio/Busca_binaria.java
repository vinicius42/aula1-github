package desafio;

import java.util.Scanner;

public class Busca_binaria {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String v[] = {"Davi" , "Arthur" , "Pedro" , "Gabriel" , "Bernardo" , "Lucas" , "Matheus" , "Rafael" , "Heitor" , "Enzo" , "Guilherme" , "Nicolas" , "Lorenzo" , "Gustavo" , "Felipe" , "Samuel" , "Jo�o Pedro" , "Daniel" , "Vitor" , "Leonardo" , "Henrique" , "Theo" , "Murilo" , "Eduardo" , "Pedro Henrique" , "Pietro" , "Cau�" , "Isaac" , "Caio" , "Vinicius" , "Benjamin" , "Jo�o" , "Lucca" , "Jo�o Miguel" , "Bryan" , "Joaquim" , "Jo�o Vitor" , "Thiago" , "Ant�nio" , "Davi Lucas" , "Francisco" , "Enzo Gabriel" , "Bruno" , "Emanuel" , "Jo�o Gabriel" , "Ian" , "Davi Luiz" , "Rodrigo" , "Ot�vio" , "Alice" , "Julia" , "Isabella" , "Manuela" , "Laura" , "Luiza" , "Valentina" , "Giovanna" , "Maria Eduarda" , "Helena" , "Beatriz" , "Maria Luiza" , "Lara" , "Mariana" , "Nicole" , "Rafaela" , "Helo�sa" , "Isadora" , "L�via" , "Maria Clara" , "Ana Clara" , "Lorena" , "Gabriela" , "Yasmin" , "Isabelly" , "Sarah" , "Ana Julia" , "Let�cia" , "Ana Luiza" , "Melissa" , "Marina" , "Clara" , "Cec�lia" , "Esther" , "Emanuelly" , "Rebeca" , "Ana Beatriz" , "Lav�nia" , "Vit�ria" , "Bianca" , "Catarina" , "Larissa" , "Maria Fernanda" , "Fernanda" , "Amanda" , "Al�cia" , "Carolina" , "Agatha" , "Gabrielly"};
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
