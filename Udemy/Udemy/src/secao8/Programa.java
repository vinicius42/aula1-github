package secao8;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Entre com os dados do produto");
		System.out.println("Nome: ");
		produto.nome = leia.nextLine();
		System.out.println("Pre�o: ");
		produto.preco = leia.nextDouble();
		System.out.println("Quantidade no estoque: ");
		produto.quantidade = leia.nextInt();
		
		// produto.toString();// Converter o objeto em String
		
		//System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);
		
		System.out.println("Dados produto: " + produto);// Aqui o java o detecta o toString automaticamente por estar dentro de um println
		
		System.out.println("Entre o n�mero de produtos para serem add ao estoque: ");
		int quantidade = leia.nextInt();
		produto.AddProduto(quantidade);// Aqui faz a atualiza��o da quantidade do objeto produto
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println("Entre o n�mero de produtos para serem removidos ao estoque: ");
		quantidade = leia.nextInt();
		produto.RemoverProduto(quantidade); // Novamente atualizando
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		
		
		leia.close();

	}

}
