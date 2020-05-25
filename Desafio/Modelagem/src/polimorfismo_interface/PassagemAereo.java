package polimorfismo_interface;

public class PassagemAereo implements I_item {
	// Atributos da classe Passagem Avião
	public String Origem = "";
	public String Destino = "";
	public double Tx_Embarque = 0.0;
	public double PrecoPassagem = 0.0;

	@Override
	public double CalcularPreco() {
		return this.Tx_Embarque + this.PrecoPassagem;
	}
	

}
