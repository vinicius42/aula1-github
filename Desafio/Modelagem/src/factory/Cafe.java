package factory;

public class Cafe implements I_bebida {
	
	private String nome = "";
	private double preco = 0.0;
	
	Cafe(){
		preparar();
	}
	
	// método privado para construção do café expresso
	// Onde a lógica específica será implementada
	private void preparar() {
		this.nome = "Café Espresso";
		this.preco = 5.5;
	}

	@Override
	public String nome() {
		// TODO Auto-generated method stub
		return this.nome + "café";
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return this.preco;
	}


}
