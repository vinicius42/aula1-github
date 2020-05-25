package memoria;

public class Alocacao {

	private static Memoria[] tamProcesso;

	public static void main(String[] args) {
		int a;
	

		int tamProcessos[] = new int[30];
		Memoria Memoria[] = new Memoria[50];

		int i = 0;
		for (i = 0; i < 30; i++) {
			a = (int) (Math.random() * 8 + 1);
			tamProcessos[i] = a;
			System.out.println("Tamanho do processo " + (i + 1) + " : " + a);
		}

		for (i = 1; i <= 10; i++) {
			a = (int) (Math.random() * 30 + 1);
			System.out.println("O tamanho da memória " + i + " : " + a);
			Memoria seg = new Memoria();
			seg.id = i;
			seg.size = a;
			Memoria[i - 1] = seg;
		}

		int j;

		for (i = 0; i < tamProcessos.length; i++) {
			for (j = 0; j < 10; j++) {
				if (Memoria[j].size >= tamProcessos[i]) {
					Memoria[j].size -= tamProcessos[i];

					System.out.println("Processo " + (i + 1) + " - " +  "alocado na memória " + Memoria[j].id
							+ ". Espaço restante após a alocação " + Memoria[j].size);
					break;
				}
			}
			if (j == 10) {
				System.out.println("Não há mais memória disponivel");
			}
		}

	}

}
