package polimorfismo_exemplos;

public class Triangulo extends Calculadora{
	public double b;
	public double h;
	
	public double CalcularArea() {
		return (this.b * this.h)/2;
	}

}
