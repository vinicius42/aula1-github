package polimorfismo_interface;

public class Teste {

	public static void main(String[] args) {
		PassagemAereo aereo = new PassagemAereo();
		Hospedagem hotel = new Hospedagem();
		Cart carrinho = new Cart();
		Automovel auto = new Automovel();
		PassagemOnibus onibus = new PassagemOnibus();
		ServicosTraslado servicos = new ServicosTraslado();
		Passeios passeio = new Passeios();
		Eventos eventos = new Eventos();
		
		// Configuração da Passagem aereo
		aereo.Origem = "Curitiba";
		aereo.Destino = "Miami";
		aereo.PrecoPassagem = 3500.00;
		aereo.Tx_Embarque = 150.00;
		
		// Adicionar o primeiro trecho aereo no carrinho
		carrinho.Itens.add(aereo);
		
		// Exibir o total contratado (total do carrinho)
		System.out.println("Total do primeiro trecho: " + 
				carrinho.CalcularTotal()
				);
		
		// Adicionar o segundo trecho
		aereo = new PassagemAereo();
		aereo.Origem = "Miami";
		aereo.Destino = "Curitiba";
		aereo.PrecoPassagem = 3800.00;
		aereo.Tx_Embarque = 380.00;
		
		// Adicionar o segundo trecho no carrinho
		carrinho.Itens.add(aereo);
		
		// Exibir o total contratado até aqui
		System.out.println(
				"Total primeiro e segundo trecho: " +
				carrinho.CalcularTotal()
				);
		
		// Definicao da hospedagem
		hotel.CheckIn = "10/10/2020";
		hotel.CheckOut = "13/10/2020";
		hotel.PrecoDiaria = 200.00;
		
		// Adicionar a hospedagem no carrinho
		carrinho.Itens.add(hotel);
		
		// Exibir o total contratado até aqui
		System.out.println("Total do primeiro e segundo trecho: " + carrinho.CalcularTotal());
		
		
		// Definicao do automóvel
		auto.DataRetirada = "10/11/2020";
		auto.DataDevolucao = "13/11/2020";
		auto.preco = 60;
		
		// Adicionar o automóvel ao carrinho 
		carrinho.Itens.add(auto);
		
		// Exibir o automóvel
		System.out.println("Total diária: " + auto.CalcularPreco());
		
		
		onibus.Origem = "Curitiba";
		onibus.Destino = "São Paulo";
		onibus.PrecoPassagem = 200.0;
		onibus.Tx_Embarque = 10.0;
		
		carrinho.Itens.add(onibus);
		
		System.out.println("Total da viajem: " + onibus.CalcularPreco());
		
		
		servicos.Origem = "Hotel";
		servicos.Destino = "Praia";
		servicos.preco = 15;
		
		carrinho.Itens.add(servicos);
		
		System.out.println("Total do serviço: " + servicos.preco);
		
		
		passeio.origem = "Hotel";
		passeio.destino = "Porto de galinhas";
		passeio.preco = 20;
		
		carrinho.Itens.add(passeio);
		
		System.out.println("Total do passeio: " + passeio.CalcularPreco());
		
		
		
		eventos.eventos = "Teatro Fernanda Montenegro";
		eventos.show = "Show do Jorge e Mateus";
		eventos.PrecoEvento = 200;
		eventos.PrecoShow = 50;
		
		carrinho.Itens.add(eventos);
		
		System.out.println("Total do evento e show: " + eventos.CalcularPreco());

	}

}
