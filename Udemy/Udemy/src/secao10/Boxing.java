package secao10;

public class Boxing {

	public static void main(String[] args) {
		// Boxing
			// � o processo de convers�o de um objeto tipo valor para um objeto tipo refer�ncia compat�vel
		
		// Exemplo
		int x = 20;
		Object obj = x;
		
		// Unboxing
			// � o processo de convers�o de um objeto tipo refer�ncia(classe) para um objeto tipo refer�ncia compat�vel
		
		// Exemplo
		// Estamos desencaixotando e transformando o objeto em tipo valor e n�o mais tipo Object
		int y = (int) obj; // Exemplo 1
		
		
		// Wrapper classes
			// Classes equivalentes aos tipos primitivos
				// Integer(int), Float(float), Double(double), etc
			// S�o mais utilizadas em campos que podem ter valor nulo, ou seja, n�o s�o obrigat�rios

	}

}