package prova;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;

public class Exercicio_3 {

	public static void main(String[] args) {
		String caminho = "D:\\picanha_na_brasa.txt";

		try {
			FileReader arquivo = new FileReader(caminho);
			BufferedReader leitor = new BufferedReader(arquivo);
			String linha = leitor.readLine();
			String[] palavra;
			HashMap<String, Integer> picanha_vermelha = new HashMap<String, Integer>();
			while (linha != null) {
				palavra = linha.toLowerCase().split(" ");
				for (String s : palavra) {
					if (picanha_vermelha.get(s) == null) {
						picanha_vermelha.put(s, 1);
					} else {// A chave não existe e deve ser inserida
						picanha_vermelha.put(s, 1);
					}
				}
				linha = leitor.readLine();
			}

			// Mostrar o conteúdo da tabela hash
			FileWriter saida = new FileWriter("D:\\saida.txt", true); // O true acrescenta linhas no arquivo
			PrintWriter gravador = new PrintWriter(saida);
			for (Entry<String, Integer> entry : picanha_vermelha.entrySet()) {
				gravador.write(entry.getKey() + ": " + entry.getValue() + System.lineSeparator());
			}
			
			System.out.println("Verifica a picanha!");
			
			// Fim da leitura
			saida.close();
			arquivo.close();
			leitor.close();
			gravador.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
