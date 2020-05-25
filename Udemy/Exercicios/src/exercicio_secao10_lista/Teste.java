package exercicio_secao10_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		List<Empregado> emp = new ArrayList<>();
		
		System.out.println("Quantos empregados serão registrados ?");
		int n = leia.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Empregado #" + i + ": ");
			System.out.print("Id: ");
			int id = leia.nextInt();
			System.out.println("Nome: ");
			leia.nextLine();
			String nome = leia.nextLine();
			System.out.println("Salário: ");
			double salario = leia.nextDouble();
			emp.add(new Empregado(id, nome, salario));
		}
		
		System.out.print("Entre o id do empregado que terá aumento de salário: ");
		int id = leia.nextInt();
		
		Empregado empr = emp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(empr == null) {
			System.out.println("Esse id não existe");
		}
		else {
			System.out.println("Entre com a porcentagem: ");
			double porcentagem = leia.nextDouble();
			empr.AumentoSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de empregados: ");
		for(Empregado obj : emp) {
			System.out.println(obj);
		}
		leia.close();
		
	}
}
