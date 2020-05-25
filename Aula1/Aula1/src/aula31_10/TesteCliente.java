package aula31_10;

public class TesteCliente {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Escobar";
		pessoa.cpf = "888";
		
		Cliente Cliente = new Cliente();
		Cliente.nome = "Pedro de Lara";
		Cliente.cpf = "123";
		Cliente.LimiteCredito = 10000;
		Cliente.Salvar();
 
	}

}
