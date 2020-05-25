package exercicio_secao9;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o n�mero da conta: ");
		int conta = leia.nextInt();

		System.out.println("Entre com o nome da conta: ");
		leia.nextLine();
		String nome = leia.nextLine();

		System.out.println("Deseja depositar algum valor ? (s/n)");
		char resposta = leia.next().charAt(0);

		Conta count;

		if (resposta == 's') {
			System.out.println("Entre o valor do dep�sito: ");
			double valorInicial = leia.nextDouble();
			
			count = new Conta(conta, nome, valorInicial);
		}
		else {
			count = new Conta(conta, nome);
		}
		
		System.out.println("Dados da conta: ");
		System.out.println(count);
		
		System.out.println("Entre com um valor de dep�sito: ");
		double valorDeposito = leia.nextDouble();
		count.Deposito(valorDeposito);
		
		System.out.println("Dados atualizados: ");
		System.out.println(count);
		
		System.out.println("Entre o valor que deseja retirar: ");
		double valorSaque = leia.nextDouble();
		count.Deposito(valorSaque);
		System.out.println("Dados atualizados: ");
		System.out.println(count);
		
		leia.close();
		
		

	}

}
