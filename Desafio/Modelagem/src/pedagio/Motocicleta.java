package pedagio;

public class Motocicleta extends Pedagio{
	
	Motocicleta(){
		this.nome = "Motocicleta";
		this.preco = 2.50;
	}
	
	@Override
	public double preco() {
		return this.preco;
	}

}
