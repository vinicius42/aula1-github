package aula3;

public class exercicio3 {

	public static void main(String[] args) {
		// 3 - Imprimir os n�meros de 1 a 320, mas, substituir os m�ltiplos de 4 por "###"
		int i;
		for (i=1;i<=320;i++) {
			if(i % 4 == 0) {
			System.out.println("###");
			}
			else {
				System.out.println(i);
			}

	}

}
}