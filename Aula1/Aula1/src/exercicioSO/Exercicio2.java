package exercicioSO;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int[] vetor = new int[400];
			  
	        Thread t1 = new Thread(new Runnable() {
	    		int soma1;
	            @Override
	            public void run() {
	        		for (int x = 0; x < 100; x++) {
	        			int a = (int) (Math.random() * 4 + 1);
	        			vetor[x] = a;
	        			soma1 += vetor[x];
	        		}
	        		System.out.println("A soma da 1° Thread é: " + soma1);
	            }
	        });
	  
	        Thread t2 = new Thread(new Runnable() {
	        	int soma2;
	            @Override
	            public void run() {
	        		for (int x = 100; x < 200; x++) {
	        			int a = (int) (Math.random() * 2 + 1);
	        			vetor[x] = a;
	        			soma2 += vetor[x];
	        		}
	        		System.out.println("A soma da 2° Thread é: " + soma2);
	            }
	        });
	  
	        Thread t3 = new Thread(new Runnable() {
	        	int soma3;
	            @Override
	            public void run() {
	        		for (int x = 200; x < 300; x++) {
	        			int a = (int) (Math.random() * 3 + 1);
	        			vetor[x] = a;
	        			soma3 += vetor[x];
	        		}
	        		System.out.println("A soma da 3° Thread é: " + soma3);
	            }
	        });
	        
	        Thread t4 = new Thread(new Runnable() {
	        	int soma4;
	            @Override
	            public void run() {
	        		for (int x = 300; x < 400; x++) {
	        			int a = (int) (Math.random() * 4 + 1);
	        			vetor[x] = a;
	        			soma4 += vetor[x];
	        		}
	        		System.out.println("A soma da 4° Thread é: " + soma4);
	            }
	        });
	        
	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();
	        
	        try {
	            t1.join();
	            t2.join();
	            t3.join();
	            t4.join();
	        } catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }
	        
	        
	        int soma = 0;
	        for (Integer valor : vetor) {
	            soma += valor;
	        }
	        
	        System.out.println("A soma total é: " + soma);
	  
	}
}
