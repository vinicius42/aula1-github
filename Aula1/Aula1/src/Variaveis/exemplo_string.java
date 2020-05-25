package Variaveis;

public class exemplo_string {

	public static void main(String[] args) {
		String nome;
		String sobrenome;
		nome = "Vinicius";
		sobrenome = "Junior";
		System.out.println(nome + " " + sobrenome);
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		
		String nomecompleto = nome + " " + sobrenome;
		System.out.println(nomecompleto);
	}

}
