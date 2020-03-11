package conexoes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class conexaosqlite {

private Connection conexao;


//Conecta e cria um banco, se n�o existir.
public boolean conectar() {
try {
//Criando endere�o do banco
String url = "jdbc:sqlite:banco/bancosqlite.db";

//iniciando a conex�o
this.conexao = DriverManager.getConnection(url);
}catch (SQLException e) {
System.out.println("Erro na conex�o com o banco! >>"+e.getMessage());
return false;
}

System.out.println("Conectou!");
return true;
}

//Desconecta do banco
public boolean desconectar() {
try {
if(this.conexao.isClosed() == false) {
this.conexao.close();
}
}catch(SQLException e) {
System.out.println("Erro ao desconectar >>"+e.getMessage());
return false;
}

System.out.println("Desconectou!");
return true;

}

//Criando os statements para execu��o dos c�digos SQL
public Statement criarStatement() {
try {
return this.conexao.createStatement();
}catch(SQLException e) {
System.out.println("Erro>>"+e.getMessage());
return null;
}
}


public PreparedStatement criarPreparedStatement (String sql) {
	try {
		return this.conexao.prepareStatement(sql);}
		catch(SQLException e) {
			System.out.println("ERRO: "+e.getMessage());
			return null;
		}
	
   }
public Connection getConnection() {
	return this.conexao;
}

}
