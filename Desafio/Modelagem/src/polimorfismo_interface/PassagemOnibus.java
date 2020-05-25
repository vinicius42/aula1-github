package polimorfismo_interface;

public class PassagemOnibus implements I_item {
	public String Origem = "";
	public String Destino = "";
	public double Tx_Embarque = 0.0;
	public double PrecoPassagem = 0.0;

	@Override
	public double CalcularPreco() {
		return this.Tx_Embarque + this.PrecoPassagem;
	}

}
