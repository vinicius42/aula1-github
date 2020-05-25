package factory;

public class Produto implements I_bebida {
	private String nome = "";
	private double preco = 0.0;
	
	private void preparar() {};
	public String nome() {
		return "Olá";
	}
	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 0;
	}

}
