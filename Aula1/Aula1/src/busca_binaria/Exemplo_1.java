package busca_binaria;

public class Exemplo_1 {

	public static void main(String[] args) {
		int v[] = {10, 12, 16, 18, 21, 25, 30};
		int inicio; // marcador do inicio
		int meio; // marcador do elemento mediano
		int fim; // marcador final do segmento analisado
		int resultado = -1; // Valor padrão "não encontrado"
		int buscar = 12; // localizar a posição no vetor
		inicio = 0;
		fim = v.length - 1;
		
		while(inicio <= fim) {
			// Descobre o meio do segmento
			meio = (inicio + fim)/2;
			if(v[meio] == buscar) {
				resultado = meio;
			}
			if(v[meio] < buscar) {
				// Desprezar o segmento da esquerda = mover o inicio
				inicio = meio + 1;
			}
			else {
				// Desprezar o segmento da direita = mover o fim
				fim = meio - 1;
			}
		}
		System.out.println(resultado);

	}

}
