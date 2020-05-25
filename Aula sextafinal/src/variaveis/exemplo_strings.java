package variaveis;

public class exemplo_strings {

	public static void main(String[] args) {
		String nome;
		String sobrenome;
		nome = "Pedro";
		sobrenome = "Henrique";
		System.out.println(nome +" "+sobrenome);
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		
		String nomecompleto = nome + " " + sobrenome;
		
		System.out.println(nomecompleto);

	}

}
