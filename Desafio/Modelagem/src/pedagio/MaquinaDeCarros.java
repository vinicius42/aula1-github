package pedagio;

public class MaquinaDeCarros {
	public I_Auto Precos(String tipopedagio) {
		I_Auto auto = null;
		
		switch (tipopedagio) {
		case "Automóvel":
			AutoPasseio passeio = new AutoPasseio();
			auto = passeio;
			break;
			
		case "Camionete":
			Camionete camionete = new Camionete();
			auto = camionete;
			break;
			
		case "Onibus":
			Onibus onibus = new Onibus();
			auto = onibus;
			break;
			
		case "Caminhão":
			Caminhao caminhao = new Caminhao();
			auto = caminhao;
			break;
			
		case "Motocicleta":
			Motocicleta moto = new Motocicleta();
			auto = moto;
			break;
			
		case "Pedestre":
			Pedestre pedestre = new Pedestre();
			auto = pedestre;
			break;
			
		case "Bicicleta":
			Bicicleta bike = new Bicicleta();
			auto = bike;
			break;
		
			

		default:
			break;
		}
		return auto;
	}

}
