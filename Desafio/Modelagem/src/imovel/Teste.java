package imovel;

public class Teste {

	public static void main(String[] args) {
		
		Usado usado = new Usado();
		System.out.println("Usado: " + usado.Taxa(0));
		
		Novo novo = new Novo();
		novo.QualidadeImovel = "Novo";
		System.out.println("Novo: " + novo.Taxa(0.15));
		
		Antigo antigo = new Antigo();
		antigo.QualidadeImovel = "Antigo";
		System.out.println("Antigo: " + antigo.Taxa(0.15));

	}

}
