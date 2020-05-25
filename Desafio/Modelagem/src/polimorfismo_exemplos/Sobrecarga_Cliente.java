package polimorfismo_exemplos;

public class Sobrecarga_Cliente {
	public String Nome = "";
	public String cpf = "";
	public String email = "";
	
	// Construto padrão
	Sobrecarga_Cliente(){}
	
	// Construtor personalizado
	Sobrecarga_Cliente(String cpf){
		if(cpf == "888") {
			this.Nome = "Pedro de Lara";
			this.cpf = cpf;
			this.email = "exemplo@hotmail.com";
		}
	}

}
