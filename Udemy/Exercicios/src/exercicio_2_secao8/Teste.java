package exercicio_2_secao8;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		
		System.out.println("Nome: ");
		empregado.nome = leia.nextLine();
		System.out.println("Salário: ");
		empregado.salario = leia.nextDouble();
		System.out.println("Imposto: ");
		empregado.imposto = leia.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + empregado);
		
		System.out.println();
		System.out.println("Qual porcentagem para aumento do salário: ");
		double porcentagem = leia.nextDouble();
		empregado.AumentoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + empregado);

	}

}
