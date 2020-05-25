package secao9;

public class Encapsulamento {
	
	private String nome;
	private double preco;
	
	// Se eu precisar alterar ou acessar o atributo private, eu devo usar m�todos para tal
	
	public String getNome() {// M�todo para obter/acessar o nome. E o m�todo pra retornar deve ser o mesmo tipo do atributo
		// Exemplo: O atributo � tipo String, o m�todo deve ser do tipo String
		// Normalmente retorna apenas o atributo
		return nome;
	}
	
	public void setNome(String nome) {// Alterar o valor do atributo, usa-se o m�todo "set"
		// Como esse m�todo � para alterar, ele n�o vai retornar nada. Vai apenas receber o valor pro atributo
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco; // Atribuindo o valor para o atributo do objeto
	}

}
