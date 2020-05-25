package prova;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		String data = "";
		Maquina maq = new Maquina();
		I_Produto pedido = maq.EntregaProduto("Salgadinho");
		maq.produto.add(pedido);
		System.out.println(pedido.nome() + " - " + pedido.preco());
		
		pedido = maq.EntregaProduto("Refrigerante");
		maq.produto.add(pedido);
		System.out.println(pedido.nome() + " - " + pedido.preco());
		
		System.out.println("Total: " + maq.CalcularTotal());
		
		
		// Debito em conta
		Debito saque = new Debito(maq.CalcularTotal());
		saque.Pagar(saque);
		
		
		// Cartão de crédito		
		Credito credito = new Credito(maq.CalcularTotal());
		credito.Pagar(credito);
		
		
		// Digital
		Digital digital = new Digital(maq.CalcularTotal());
		digital.Pagar(digital);		

	}

}
