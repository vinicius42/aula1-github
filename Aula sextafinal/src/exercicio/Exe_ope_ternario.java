package exercicio;

public class Exe_ope_ternario {

	public static void main(String[] args) {
		String nome = "Vinicius";
		System.out.println(nome.equalsIgnoreCase("Vinicius")?"Não rola" : "Assim é melhor");
		
		int n1, n2;
		n1 = 20;
		n2 = 30;
		System.out.println((n1 > n2) ? n1 + 1 : n2 * 2);

	}

}
