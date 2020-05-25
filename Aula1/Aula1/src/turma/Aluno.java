package turma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Aluno {
	public String matricula = "";
	public String cpf = "";
	public String nome = "";
	private boolean novo_aluno = true;
	
	Aluno(){};
	Aluno(String matricula){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Aluno", "root", "");
			Statement comando = con.createStatement();
			String sql = "Select matricula, cpf, nome from Aluno where matricula = '" + matricula + "'";
			ResultSet rsAluno = comando.executeQuery(sql);
			if(rsAluno.next()) {
				this.novo_aluno = false;
				this.matricula = rsAluno.getString("matricula");
				this.cpf = rsAluno.getString("cpf");
				this.nome = rsAluno.getString("nome");
			}
			else {
				this.matricula = matricula;
				this.novo_aluno = true;
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
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Aluno", "root", "");
			if(this.novo_aluno) {
				sql = "Insert into Aluno values ('" + this.matricula + "'," + "'" + this.cpf + "'," + "'" + this.nome + "')";
			}
			else {
				sql = "Update Aluno set cpf = '" + this.cpf + "', nome = '" + this.nome + "' where matricula = '" + this.matricula + "'";
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
