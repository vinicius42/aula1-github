package secao8;

public class Calculadora_Estaticos {
	public static final double PI = 3.14159; // Aqui temos um exemplo de estático, uma vez atribuido com a palavra "final" ele não
	 // irá mudar mais o valor.
	// Padrão é letra maisúscula para constantes
	
	
	public static double circunferencia (double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}

}
