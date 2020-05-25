package factory;

public class Cafe implements I_bebida {
	
	private String nome = "";
	private double preco = 0.0;
	
	Cafe(){
		preparar();
	}
	
	// m�todo privado para constru��o do caf� expresso
	// Onde a l�gica espec�fica ser� implementada
	private void preparar() {
		this.nome = "Caf� Espresso";
		this.preco = 5.5;
	}

	@Override
	public String nome() {
		// TODO Auto-generated method stub
		return this.nome + "caf�";
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return this.preco;
	}


}
