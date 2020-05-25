package exercicio_1_secao8;

public class Retangulo {
	public double largura = 0.0;
	public double altura = 0.0;
	
	public double Area() {
		return largura * altura;
	}
	
	public double Perimetro() {
		double p = 2 * (altura + largura);
		return p;
	}
	
	public double Diagonal() {
		double p = Math.sqrt(largura * largura + altura * altura);
		return p;
	}

}
