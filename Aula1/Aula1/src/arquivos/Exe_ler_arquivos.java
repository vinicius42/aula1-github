package arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exe_ler_arquivos {

	public static void main(String[] args) {
		String caminho_arquivo = "D:\\receita.txt";
		String linha = "";
		try {
			FileReader arquivo = new FileReader(caminho_arquivo);
			BufferedReader leitor = new BufferedReader(arquivo);
			while(linha != null) {
				linha = leitor.readLine(); // le a proxima linha
				System.out.println(linha != null ? linha : "");
			}
			// Fim da leitura
			arquivo.close();
			leitor.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage() + "\n Verifique se o nome do arquivo est� correto \n ou se ele existe na pasta");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
