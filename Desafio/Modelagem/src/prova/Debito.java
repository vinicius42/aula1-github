package prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Debito extends FormaDePagamento {
	public String banco = "";
	public String agencia = "";
	public String conta = "";

	/*
	 * public Debito(String b, String a, String c, double v, String cpf) { banco =
	 * b; agencia = a; conta = c; valor = v; this.cpf = cpf; }
	 */
	
	Debito(){
		
	}
	
	public Debito(double calcularTotal){
		this.agencia = "546";
		this.banco = "Bradesco";
		this.valor = calcularTotal;
		this.cpf = "888";
	}

	public boolean Pagar(I_Pagamento pago) {
		String sql = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pagamento", "root", "");
			sql = "Insert into formaPagamento values ('" + this.cpf 
					+ "'," 
					+ "'"
 					+ this.hoje 
 					+ "'," 
 					+ "'D�bito'"
 					+ ",'" 
 					+ this.valor 
 					+ "')";

			System.out.println(sql);
			Statement comando = con.createStatement();
			comando.execute(sql);
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

}
