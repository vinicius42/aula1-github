package pedagio;

public class PgtoPedagio {
	public static void main(String[] args) {
		MaquinaDeCarros maq = new MaquinaDeCarros();
		I_Auto pago = maq.Precos("Pedestre");
		pago.NumeroEixos(3);   
		System.out.println(pago.nome() + " - " + pago.preco());

	}

}
