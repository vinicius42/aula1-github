package mubank;

public class Teste {

	public static void main(String[] args) {
		Pessoa_Fisica fisica = new Pessoa_Fisica();
		Pessoa_Juridica juridica = new Pessoa_Juridica();
		Conta count = new Conta();
		Conta_poupanca poupanca = new Conta_poupanca();
		Conta_corrente corrente = new Conta_corrente();
		Pessoa pessoa = new Pessoa();
		
		fisica.cpf = "55555554568";
		fisica.nome = "João";
		fisica.saldo = 500;
		
		pessoa.contas.add(corrente);
		
		System.out.println("Total do primeiro trecho: " + pessoa.Calcular());
		
		count.tipo_conta = "Premium";
		count.saldo = 500;
		
		pessoa.contas.add(count);
		
		System.out.println("Total do segundo trecho: " + pessoa.Calcular());
		

	}

}
