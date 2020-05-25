package filial;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Exercicio {

	public static void main(String[] args) {
		String saldo;
		String movimento;
		FileReader arquivo;
		FileWriter arquivoS;

		try {
			arquivo = new FileReader("D:\\movimento.csv");
			BufferedReader leitor = new BufferedReader(arquivo);

			arquivoS = new FileWriter("D:\\saldo.txt", true); // O true acrescenta linhas no arquivo
			PrintWriter gravador = new PrintWriter(arquivoS);

			HashMap<String, Integer> tabela = new HashMap<String, Integer>();
			String[] loja;
			String linha = ",";

			linha = leitor.readLine(); // le a proxima linha

			while (linha != null) {
				loja = linha.split(",");
				if (tabela.get(loja[0]) == null) {
					tabela.put(loja[0], Integer.parseInt(loja[1]));
				} else {// A chave não existe e deve ser inserida
					tabela.put(loja[0], (tabela.get(loja[0]) + Integer.parseInt(loja[1])));
				}
				linha = leitor.readLine();
			}
			
			// Gerando o contador com número e os valores
			for (Entry<String, Integer> lojasEntry : tabela.entrySet()) {
				gravador.write("Código da loja " + lojasEntry.getKey() + "\t Total do caixa: " + lojasEntry.getValue()
						+ System.lineSeparator());
			}

			arquivo.close();
			leitor.close();
			arquivoS.flush();
			arquivoS.close();
			gravador.close();
			System.out.println("Verifique o arquivo");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
