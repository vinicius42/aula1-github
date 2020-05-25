package polimorfismo_interface;

public class Passeios implements I_item {
	public String passeio = "";
	public String origem = "";
	public String destino = "";
	public double preco = 0.0;

	@Override
	public double CalcularPreco() {
		// TODO Auto-generated method stub
		return preco;
	}

}
