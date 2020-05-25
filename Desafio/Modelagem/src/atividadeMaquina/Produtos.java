package atividadeMaquina;

public class Produtos implements I_produtos {
	public String nome = "";
	public double preco = 0.0;
	
	
	@Override
	public String nome() {
		return this.nome;
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return this.preco;
	}


}
