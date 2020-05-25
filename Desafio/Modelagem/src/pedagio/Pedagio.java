package pedagio;

public class Pedagio implements I_Auto {
	public String nome = "";
	public double preco = 0.0;
	public double NumeroEixos = 0.0;
	
	
	@Override
	public String nome() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return this.preco * this.NumeroEixos;
	}

	@Override
	public void NumeroEixos(double d) {
		this.NumeroEixos = d;
	}
	

	
	

}
