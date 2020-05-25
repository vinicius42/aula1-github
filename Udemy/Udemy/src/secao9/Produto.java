package secao9;

public class Produto {
	
	// Modificadores de acesso:
		// private, (nada), protected, public
		// Ex. nada: double preco

	private String name; // O private s� pode ser acessado na pr�pria classe
	private double price;
	private int quantity;
	
	
	public Produto() {// Construtores n�o possuem tipagem, ou seja, � apenas "public Produto" e n�o "public double Produto"
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.name = nome; // A palavra this refere-se ao pr�prio objeto
		this.price = preco;
		this.quantity = quantidade;
	}
	
	// Sobrecarga � um recurso que uma classe possui de oferecer mais de uma opera��o com o mesmo nome, por�m com diferentes
	// listas de par�metros
	
	// Exemplo de sobrecarga
	
	public Produto(String nome, double preco) {
		this.name = nome; // A palavra this refere-se ao pr�prio objeto
		this.price = preco;
		quantity = 0; // Opcional
	}
	
	public String getNome() {
		return name;
	}
	
	public void setNome(String nome) {
		name = nome;
	}
	
	public double getPreco() {
		return price;
	}
	
	public void setPreco(double price) {
		this.price = price;
	}
	
	public double getQuantidade() {
		return quantity;
	}
		

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
