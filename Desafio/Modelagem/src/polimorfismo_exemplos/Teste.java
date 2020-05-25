package polimorfismo_exemplos;

public class Teste {

	public static void main(String[] args) {
//		Sobrecarga_Cliente cli = null; // Instanciação do objeto cliente a partir da classe Cliente
//		cli = new Sobrecarga_Cliente();
//		System.out.println("Nome: " + cli.Nome);
//		
//		cli = new Sobrecarga_Cliente("888");
//		System.out.println("Nome: " + cli.Nome + "\n" + "Cpf: " + cli.cpf + "\n" + "Email: "+cli.email);
		
//		Calculadora calc = new Calculadora();
//		System.out.println("Double: "+ calc.Somar(3.5, 4.9));
//		System.out.println("Int: " + calc.Somar(10, 15));
		
		Triangulo tri = new Triangulo();
		tri.b = 3;
		tri.h = 2;
		System.out.println("Área do Triangulo: " + tri.CalcularArea());
		
		Circulo cir = new Circulo();
		cir.r = 8;
		System.out.println("Área do Circulo: " + cir.CalcularArea());

	}

}
