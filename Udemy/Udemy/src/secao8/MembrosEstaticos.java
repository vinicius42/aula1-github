package secao8;

import java.util.Scanner;

public class MembrosEstaticos {
	

	public static void main(String[] args) {
		// Membros instanciados possuem um comportamento diferente para cada um
		
		// Membro Est�tico, n�o pode ser instanciado, n�o criamos objeto daquela classe
			// Math.sqrt(double)
		
		// Dentro do m�todo est�tico (static) n�o � poss�vel chamar m�todos que n�o sejam est�ticos dentro de um que seja est�tico
		
		Scanner leia = new Scanner(System.in);
		
		//Calculadora_Estaticos calc = new Calculadora_Estaticos(); // Temos que instanciar o m�todo pois ele n�o � est�tico e s� assim conseguiremos us�-lo
		// na classe main
		
		System.out.println("Entre com o valor do raio: ");
		double raio = leia.nextDouble();
		
		double c = Calculadora_Estaticos.circunferencia(raio);
		
		double v = Calculadora_Estaticos.volume(raio);
		
		System.out.println("Circunfer�ncia: " + c);
		System.out.println("Volume: " + v);
		System.out.println("Valor de PI: " + Calculadora_Estaticos.PI);
		
	}
	
	

}
