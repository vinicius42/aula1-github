package coisas;

import java.util.Scanner;

import turma.Aluno;
import turma.Turma;

public class Loja {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String resp = "s";
		Endereco endereco = new Endereco();
		Cliente cliente = null;
		Situacao pagamento = new Situacao();
		pagamento.NossoNumero = "555555";
		pagamento.Valor = 5200.0;
		try {
			pagamento.setSituacao("cancelado");
			
			System.out.println(pagamento.Valor + "-" + pagamento.NossoNumero + "-" + pagamento.getSituacao());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//cliente.Salvar();

	}

}
