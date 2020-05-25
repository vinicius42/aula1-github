package polimorfismo_interface;

public class Eventos implements I_item {
	public String show = "";
	public String eventos = "";
	public double PrecoShow = 0.0;
	public double PrecoEvento = 0.0;
	
	@Override
	public double CalcularPreco() {
		// TODO Auto-generated method stub
		return PrecoShow + PrecoEvento;
	}
	

}
