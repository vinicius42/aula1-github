package atividadeMaquina;

public class MaquinaDeProdutos {
	public I_produtos EntregaDeProdutos(String tipoproduto) {
		I_produtos prod = null;
		
		switch (tipoproduto) {
		case "Salgadinho":
			Salgadinho salgadinho = new Salgadinho();
			prod = salgadinho; 
			break;
			
		case "Refrigerantes":
			Refrigerante refri = new Refrigerante();
			prod = refri; 
			break;
			
		case "Suco":
			Suco suco = new Suco();
			prod = suco; 
			break;

		default:
			break;
		}
		return prod;
	}


}
