package secao7;

public class FormatacoesString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG";
		
		String s01 = original.toLowerCase(); // Deixar tudo em min�sculo
		String s02 = original.toUpperCase(); // Deixar em mai�sculo
		String s03 = original.trim(); // Mant�m a String original, por�m remove os espa�os adicionais
		String s04 = original.substring(2); // Quero pegar somente do valor que eu setar adiante (Ex.: 2) e montar uma nova String
		String s05 = original.substring(2, 9); // Desse jeito ele vai cortar a partir do primeiro valor at� o ultimo
		String s06 = original.replace('a', 'x'); // Vai trocar os caracteres
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc"); // Primeira ocorr�ncia do "bc"
		int j = original.lastIndexOf("bc"); // A �ltima ocorr�ncia do "bc"
		
		String s = "potato apple lemon";
		String [] vetor = s.split(" "); // Aqui estou usando o espa�o em branco como separador
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);	

	}

}
