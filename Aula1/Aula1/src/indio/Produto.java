package indio;

public class Produto extends Produto_esp{
	public double LimiteCredito = 0;
	
	
	public void Salvar() {
		System.out.println("Salvando os produtos");
		super.Salvar();
	}
}
