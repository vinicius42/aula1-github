package show;

public class Vip extends Ingresso {
	public String NivelIngresso = "vip";
	
	@Override
	public double Adicional(double adicional) {
		if(this.NivelIngresso == "vip") {
			adicional = adicional + 10;
		}
		return this.reais * adicional;
	}

}
