package factory;

public class MaquinaDeBebidas {
	
	public I_bebida EntregaDeBebidas(String tipobebida) {
		I_bebida bebida = null;
		
		switch (tipobebida) {
		case "Espresso":
			Cafe cafe = new Cafe();
			bebida = cafe;
			break;
			
		case "Refri":
			Refrigerante refri = new Refrigerante();
			bebida = refri;
			break;
			
		case "Suco":
			Suco suco = new Suco();
			bebida = suco;
			break;

		default:
			break;
		}
		
		return bebida;
		
	}

}
