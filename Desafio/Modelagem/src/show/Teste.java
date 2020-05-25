package show;

public class Teste {

	public static void main(String[] args) {
		
		
		int reais = 5;
		
		Ingresso ingresso = new Ingresso();
		ingresso.reais = 5;
		System.out.println("Ingresso: " + ingresso.reais);
		
		Pista pista = new Pista();
		System.out.println("Pista: " + pista.NivelIngresso);
		
		Vip vip = new Vip();
		vip.reais = 10;
		System.out.println("Vip: " + vip.Adicional(10));
		
		PistaPremium premium = new PistaPremium();
		System.out.println("Premium: " + premium.localizacao);
		
		Camarote camarote = new Camarote();
		camarote.reais = 20;
		System.out.println("Camarote: " + camarote.Adicional(10));

	}

}
