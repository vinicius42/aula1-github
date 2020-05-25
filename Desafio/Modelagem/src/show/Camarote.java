package show;

public class Camarote extends Ingresso {
	public String NivelIngresso = "camarote";	
	
	@Override
	public double Adicional(double adicional) {
		if(this.NivelIngresso == "camarote") {
			adicional = adicional + 20;
		}
		return this.reais * adicional;
	}

}
