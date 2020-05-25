package exercicio_lista;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio_1 {

	public static void main(String[] args) {
		int total = 0;
		String texto = "D:\\texto.txt";
		String exception = "";
		FileReader stop;

		try {
			stop = new FileReader("D:\\picanha_na_brasa.txt");
			BufferedReader stop_reader = new BufferedReader(stop);
			ArrayList<String> stop_list = new ArrayList<String>();
			// Carregar as stopwords
			String stop_palavra = stop_reader.readLine();
			while (stop_palavra != null) {
				stop_list.add(stop_palavra);
				stop_palavra = stop_reader.readLine();
			}
			// Carregar o corpus
			FileReader corpus = new FileReader("D:\\picanha_na_brasa.txt");
			BufferedReader corpus_reader = new BufferedReader(corpus);
			String linha = corpus_reader.readLine();
			String[] s;
			HashMap<String, Integer> mapa_de_palavras = new HashMap<String, Integer>();

			while (linha != null) {
				// Quebrar a linha em tokens (palavras)
				s = linha.toLowerCase().split(" ");

				// Iniciar a contagem
				// Passo 1: Verificar se não está nas stopwords
				for (String palavra : s) {
					if (!stop_list.contains(palavra)) {// Não está nas stopwords
						total += 1;
						// Se não está no mapa, adicionar com valor igual a 1
						if (mapa_de_palavras.get(palavra) == null) {
							mapa_de_palavras.put(palavra, 1);
						} else {
							// Se está no mapa, adicionar 1 ao valor atual
							int valor = mapa_de_palavras.get(palavra);
							mapa_de_palavras.put(palavra, valor + 1);

						}
					}
				}
				linha = corpus_reader.readLine();// Próxima linha
			}

			// Fim da leitura
			corpus.close();
			stop_reader.close();
			
			// Número de palavras da resenha
			System.out.println("O número de palavras na resenha é: " + total);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
