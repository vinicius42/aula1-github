package aula31_10;

public class Cliente extends Pessoa {
	public double LimiteCredito = 0;
	
	@Override 
	public void Salvar() {
		System.out.println("Salvando o cliente no banco de dados");
		super.Salvar(); // Deixa o comportamento original, conforme roda na superclasse. Chama a classe mãe
	}

}
