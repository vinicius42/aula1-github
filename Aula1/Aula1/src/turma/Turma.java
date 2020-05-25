package turma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Turma {
	public String id = "";
	public String nome = "";
	public String curso = "";
	private boolean nova_turma = true;
	public ArrayList<Aluno> aluno = new ArrayList<Aluno>();
	
	
	Turma(){};
	Turma(String id){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:localhost/turma", "root", "");
			Statement comando = con.createStatement();
			String sql = "Select id, nome, curso from turma where id = '" + id + "'";
			ResultSet rsTurma = comando.executeQuery(sql);
			if(rsTurma.next()) {
				this.nova_turma = false;
				this.id = rsTurma.getString("id");
				this.nome = rsTurma.getString("nome");
				this.curso = rsTurma.getString("curso");
			}
			else {
				this.id = id;
				this.nova_turma = true;
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
}