package mubank;

public class Conta_poupanca extends Conta{
	
	public double TXretornoCDI() {
		double cdi = 0.0;
		cdi = (0.4 * 365) + saldo;
		return cdi;
	}


	public double Calcular() {
		// TODO Auto-generated method stub
		return 0;
	}

}
