package empresa;

public class Teste_Heranca {

	public static void main(String[] args) {
		double bonus = 0.1;
		
		Operador operador = new Operador();
		operador.Salario = 1000;
		System.out.println("Operador: "+ operador.CalcularBonificacao(0.10));
		// Retornar� 100
		// Esse c�lculo foi realizado pelo m�todo herdado CalcularBonificacao();
		
		Gerente gerente1 = new Gerente();
		gerente1.Salario = 3000;
		System.out.println("Gerente1: " + gerente1.CalcularBonificacao(0.10));
		// Retornar� 300, pois o NivelGerencial � Gerente_1 como padr�o
		
		Gerente gerente3 = new Gerente();
		gerente3.NivelGerencial = "Gerente_3"; // Alterando o NivelGerencial
		gerente3.Salario = 6000;
		System.out.println("Gerente3: " + gerente3.CalcularBonificacao(0.10));
		// Retornar� 720, pois o NivelGerencial � Gerente_3 tem 2% de acr�scimo ao bonus
		// essa regra foi executada sobreescrevendo o m�todo CalcularBonificacao

	}

}
