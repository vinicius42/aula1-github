package polimorfismo_interface;

public class ServicosTraslado implements I_item {
	public String Origem = "";
	public String Destino = "";
	public double preco = 0.0;

	@Override
	public double CalcularPreco() {
		// TODO Auto-generated method stub
		return preco;
	}

}
