package atividade;

public class Teste {

	public static void main(String[] args) {
		Fornecedor forn = new Fornecedor();
		forn.valorCredito = 150;
		forn.valorDivida = 100;
		System.out.println("O saldo é: " + forn.obterSaldo());
		
		Pessoa pess = new Pessoa("José");
		System.out.println("Nome: " + pess.Nome);
		
		pess = new Pessoa(17);
		System.out.println("Nome: " + pess.Nome);
		
		Empregado emp = new Empregado();
		emp.salarioBase = 1500;
		emp.imposto = 0.02;
		System.out.println("Salário do empregado: " + emp.calcularSalario());
		
		Administrador adm = new Administrador();
		adm.salarioBase = 2000;
		adm.imposto = 0.02;
		adm.ajudaDeCusto = 512.3;
		System.out.println("Salário do administrador: " + adm.calcularSalario());
		
		Operario oper = new Operario();
		oper.salarioBase = 1700;
		oper.imposto = 0.02;
		oper.comissao = 0.04;
		oper.valorProducao = 2000;
		System.out.println("Salário do operário: " + oper.calcularSalario());
		
		Vendedor vend = new Vendedor();
		vend.salarioBase = 1500;
		vend.imposto = 0.02;
		vend.comissao = 0.1;
		vend.valorVendas = 2000;
		System.out.println("Salário do vendedor: " + vend.calcularSalario());
		

	}

}
