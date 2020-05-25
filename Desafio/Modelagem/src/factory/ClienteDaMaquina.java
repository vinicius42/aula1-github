package factory;

public class ClienteDaMaquina {

	public static void main(String[] args) {
		MaquinaDeBebidas maq = new MaquinaDeBebidas();
		I_bebida pedida = maq.EntregaDeBebidas("Suco"); // Implementação da agregation
		System.out.println(pedida.nome() + ": " + pedida.preco()); // Vindo da assinatura da interface e sobreposto nas classes concretas

	}

}
