package factory;

public class Refrigerante implements I_bebida {
	// Propriedades
	
	private String nome = "";
	private double preco = 0.0;
	
	Refrigerante(){
		this.nome = "Refri";
		this.preco = 3.50; // Buscar dados na tabela de precos
	}
	
	// Sobreposição das assinaturas da interface
	
	@Override
	public String nome() {
		// TODO Auto-generated method stub
		return this.nome + "Refrigerante";
	}
	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return this.preco;
	}
	
	// Construtor

}
