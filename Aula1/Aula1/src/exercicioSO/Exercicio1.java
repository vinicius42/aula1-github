package exercicioSO;

public class Exercicio1 {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println("Iniciando a primeira thread: ");
				for(int i = 1; i < 334; i++) {
					if(i % 2 == 1) {
						System.out.println(i);
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.println("Iniciando a segunda thread: ");
				for(int i = 334; i < 667; i++) {
					if(i % 2 == 1) {
						System.out.println(i);
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.println("Iniciando a terceira thread: ");
				for(int i = 668; i < 999; i++) {
					if(i % 2 == 1) {
						System.out.println(i);
					}
				}
			}
		}.start();

	}

}
