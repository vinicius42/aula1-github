package secao8;

public class Triangulo {
	public double a = 0.0;
	public double b = 0.0;
	public double c = 0.0;
	
	
	public double Area() {
		double p = (a + b + c) / 2.0; // Trabalhando com os atributos da classe
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
