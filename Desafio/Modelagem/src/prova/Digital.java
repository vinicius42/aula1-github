package prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Digital extends FormaDePagamento{
	public String email = "";
	public String moeda = "";
	public int id;
	
	/*
	 * public Digital(String m,double v, String cpf) { valor = v; this.cpf = cpf; this.moeda = m; }
	 */
	Digital(){
		
	}
	
	public Digital(double calcularTotal) {
		this.cpf = "888";
		this.email = "email@email.com";
		this.moeda = "R$";
		this.id = 1;
		this.valor = calcularTotal;
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
 					+ "'Digital'"
 					+ ",'" 
 					+ this.valor 
 					+ "')";

			System.out.println(sql);
			Statement comando = con.createStatement();
			comando.execute(sql);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
