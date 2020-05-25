package exercicio_secao9;

public class Conta {
	private double conta;
	private String nome;
	private double valor;
	
	public double getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public Conta() {
		
	}
	
	public Conta(double conta, String nome, double valorInicial) {
		this.conta = conta;
		this.nome = nome;
		Deposito(valorInicial); // Aqui estou protegendo o construtor de mudanças, apenas tendo que alterar o método
		// this.valor = valorinicial; É a mesma coisa que está em cima
	}
	
	public Conta(double conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	public double Deposito(double amount) {
		return valor += amount;
	}
	
	public double Retirar(double amount) {
		return valor -= amount + 5.0;
	}
	
	public String toString() {
		return "Conta" + conta + ", Nome: " + nome + ", Balance: $" + String.format("%.2f", valor);
	}
	
	

}
