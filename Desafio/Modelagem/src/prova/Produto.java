package prova;

public class Produto implements I_Produto{
	public String nome = "";
	public double preco = 0.0;

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