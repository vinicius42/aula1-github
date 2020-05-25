package secao4;

import java.util.Locale;

public class CasasDecimais {

	public static void main(String[] args) {
		// Casas decimais
		double x = 10.56416;
		Locale.setDefault(Locale.US);// Deixar no padrão USA
		//System.out.printf("%.2f\n", x); // Duas casas decimais
		//%d para valor inteiro
		//%s para String
		//%f para double
		//%n ou \n pular linha 
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int idade = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Produtos:");
		System.out.println(product1 + ", cujo preço é $" + price1);
		System.out.println(product2 + ", cujo preço é $" + price2);
		
		System.out.println("Record: " + idade + " anos de idade, code " + code + " e gênero: " + gender);
		
		System.out.printf("Measure with eight decimal places: " + "%.8f\n", measure);
		System.out.printf("Rouded (three decimal please): " + "%.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: " + "%.3f", measure);
		
		
		
		
		
		
		
		
		
		
		

	}

}
