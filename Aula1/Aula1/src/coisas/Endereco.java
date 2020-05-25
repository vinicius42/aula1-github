package coisas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Endereco {
	public String logradouro = "";
	public String numero = "";
	public String cep = "";
	public String bairro = "";
	public String cidade = "";
	public String uf = "";
	public String pais = "";
	public String tipo = "";
	public String complemento = "";
	private boolean novo_endereco = true;
	
	Endereco(){};
	Endereco(String cpf){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost/coisasecoisas","root","");
			Statement comando = conexao.createStatement();
			String sql = "select tipo, rua, numero, bairro, cep, complemento, cidade, estado from endereco "
					+ "where cpf = '" + cpf + "'";
			System.out.println(sql);
			ResultSet rsEndereco = comando.executeQuery(sql);
			if(rsEndereco.next()) {
				this.tipo = rsEndereco.getString("tipo");
				this.logradouro = rsEndereco.getString("logradouro");
				this.numero = rsEndereco.getString("numero");
				this.bairro = rsEndereco.getString("bairro");
				this.cep = rsEndereco.getString("cep");
				this.complemento = rsEndereco.getString("complemento");
				this.cidade = rsEndereco.getString("cidade");
				this.uf = rsEndereco.getString("estado");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	}