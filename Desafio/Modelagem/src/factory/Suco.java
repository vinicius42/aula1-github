package factory;

public class Suco implements I_bebida {
	private String nome = "";
	private double preco = 0.0;
	
	// Construtor
	Suco(){
		prepara();
	}
	private void prepara() {
		this.nome = "Suco";
		this.preco = 8.9;
	}

	@Override
	public String nome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return this.preco;
	}
	

}
