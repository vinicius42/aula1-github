package mubank;

public class Conta implements I_conta {
	String tipo_conta = "";
	double saldo = 0.0;
	public double rendimento = 0.0;
	
	
	public double calcularconta() {
		double limite = 0.0;
		if(tipo_conta.equalsIgnoreCase("Premium")) {
			limite = (30 * saldo) + (10 * saldo);
		}
		else if(tipo_conta.equalsIgnoreCase("Standard")) {
			limite = 0.3 * saldo;
		}
		return limite;
	}
	
		

}
