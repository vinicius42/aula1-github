package coisas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cliente {
	public String cpf = "";
	public Endereco endereco = new Endereco();
	public String nome = "";
	public String telefone = "";
	private boolean novo_cliente = true;
	
	Cliente(){};
	Cliente(String cpf){
		try {
			this.cpf = cpf;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Coisas", "root", "");
			Statement comando = con.createStatement();
			String sql = "Select cpf, nome, telefone"
					+ " from Cliente "
					+ "where cpf = '" + cpf + "'";
			ResultSet rsCliente = comando.executeQuery(sql);
			if(rsCliente.next()) {
				this.novo_cliente = false;
				this.cpf = rsCliente.getString("cpf");
				this.nome = rsCliente.getString("nome");
				this.telefone = rsCliente.getString("telefone");			 
			}
			
			comando = null;
			con.close();
			con = null;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void Salvar() {
			String sql = "";
			String sql2 = "";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Coisas", "root", "");
				if(this.novo_cliente) {
					sql = "Insert into Cliente values ('" + this.cpf + "'," + "'" + this.nome 
							+ "'," + "'" + this.telefone + "')";
				/*
				 * sql2 = "Insert into Endereco values ('" + this.logradouro + "'," + "'" +
				 * this.numero + "'," + "'" + this.cep + "'," + "'" + this.bairro + "'," + "'" +
				 * this.cidade + "'," + "'" + this.uf + "'," + "'" + this.pais + "')";
				 */
				}
				else {
					sql = "Update Cliente set nome = '" + this.nome + "', telefone = '" + this.telefone 
							+ "' where cpf = '" + this.cpf + "'";
				}
				
				System.out.println(sql);
				Statement comando = con.createStatement();
				comando.execute(sql);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
