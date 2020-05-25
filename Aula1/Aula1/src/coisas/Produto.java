package coisas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Produto {
	public String idproduto = "";
	public String nome = "";
	public String preco = "";
	private boolean novo_produto = true;
	
	
	Produto(){};
	Produto(String idproduto){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Coisas", "root", "");
			Statement comando = con.createStatement();
			String sql = "Select idproduto, nome, preco from produto where idproduto = '" + idproduto + "'";
			ResultSet rsProduto = comando.executeQuery(sql);
			if(rsProduto.next()) {
				this.novo_produto = false;
				this.nome = rsProduto.getString("cpf");
				this.nome = rsProduto.getString("nome");
				this.preco = rsProduto.getString("preco");
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
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cliente", "root", "");
			if(this.novo_produto) {
				sql = "Insert into produto values ('" + this.idproduto + "'," + "'" + this.nome + "'," + "'" + this.preco + "'," + "'" + this.preco + "')";
			}
			else {
				sql = "Update produto set nome = '" + this.nome + "', preco = '" + this.preco + "' where idproduto = '" + this.idproduto + "'";
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
