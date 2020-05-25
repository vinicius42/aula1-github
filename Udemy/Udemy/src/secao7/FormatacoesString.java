package secao7;

public class FormatacoesString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG";
		
		String s01 = original.toLowerCase(); // Deixar tudo em minúsculo
		String s02 = original.toUpperCase(); // Deixar em maiúsculo
		String s03 = original.trim(); // Mantém a String original, porém remove os espaços adicionais
		String s04 = original.substring(2); // Quero pegar somente do valor que eu setar adiante (Ex.: 2) e montar uma nova String
		String s05 = original.substring(2, 9); // Desse jeito ele vai cortar a partir do primeiro valor até o ultimo
		String s06 = original.replace('a', 'x'); // Vai trocar os caracteres
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc"); // Primeira ocorrência do "bc"
		int j = original.lastIndexOf("bc"); // A última ocorrência do "bc"
		
		String s = "potato apple lemon";
		String [] vetor = s.split(" "); // Aqui estou usando o espaço em branco como separador
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);	

	}

}
