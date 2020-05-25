package atividadeMaquina;

public class Cliente {

	public static void main(String[] args) {
		MaquinaDeProdutos maq = new MaquinaDeProdutos();
		I_produtos pedido = maq.EntregaDeProdutos("Salgadinho");
		System.out.println(pedido.nome() + " - " + pedido.preco());

	}

}
