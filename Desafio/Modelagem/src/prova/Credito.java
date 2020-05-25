package prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Credito extends FormaDePagamento {
	public String operadora = "";
	public int numero = 0;
	public int seguranca = 0;
	public String data = "";
	
	/*
	 * public Credito(double v, String cpf) { valor = v; this.cpf = cpf; }
	 */
	
	Credito(){
		
	}
	
	Credito(double calcularTotal){
		this.operadora = "Visa";
		this.numero = 56456456;
		this.seguranca = 31531;
		this.data = hoje;
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
 					+ "'Crédito'"
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
