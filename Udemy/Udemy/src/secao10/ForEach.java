package secao10;

public class ForEach {

	public static void main(String[] args) {
		String [] vetor = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		
		// tipo do vetor, apelido para o vetor(pode ser qualquer um), depois a cole��o ou seja o nome da vari�vel
		// Como ler esse for: "Para cada objeto string(nome) contida no vetor "vetor" fa�a
		for (String string : vetor) {
			// Aqui ele ir� percorrer todos os elementos do vetor e chamar todos os elementos de string
			System.out.println(string); // Desse jeito � a mesma coisa que chamar o "vetor[i]" como no for acima
		}

	}

}
