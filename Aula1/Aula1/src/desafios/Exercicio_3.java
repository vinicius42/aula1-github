package desafios;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
            double soma = 0, num = 1, den = 1, a = 1;
            for(int i = 0; i <= 9; i++) {
            	soma += (num * a) / den;
            	num += 2;
            	den++;
            }
            System.out.println(soma);
		    }
		}


