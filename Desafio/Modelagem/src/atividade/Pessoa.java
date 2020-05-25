package atividade;

public class Pessoa {
	public String Nome = "";
	public String endereco = "";
	public String telefone = "";
	public int idade;

	Pessoa() {
	}

	Pessoa(String nome) {
		if (nome == "José") {
			this.Nome = nome;
			this.endereco = "Rua Carlos, 145";
			this.telefone = "3455-1345";
		}
	}

	Pessoa(int idade) {
		this.idade = idade;
		this.Nome = "Carlos";
		this.endereco = "Rua José, 334";
		this.telefone = "5153-5654";
	}
}
