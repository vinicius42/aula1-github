package mubank;

import java.util.ArrayList;

public class Pessoa {
	ArrayList<I_conta> contas = new ArrayList<I_conta>();
	
	public double Calcular(){
		double total = 0.0;
		for(I_conta conta : this.contas) {
			total += conta.calcularconta();
		}
		return total;
	}

}
