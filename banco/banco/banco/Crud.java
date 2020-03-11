package banco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import conexoes.conexaosqlite;

public class Crud {


	
	

	//Insert
	public void InsertF(Pessoa p){
	
		conexaosqlite conn = new conexaosqlite();
		CriarBancoSQLite criarBancoSQLite = new CriarBancoSQLite(conn);
		conn.conectar();

		PreparedStatement ps = null;
		ResultSet rs = null;	
		
		
		
	
		

		
		
		
	criarBancoSQLite.criarTabelaPessoa(); 	
		
	conn.conectar();

	String sqlInsert = "INSERT INTO pessoa ("
	+ "id,"
	+ "nome,"
	+ "idade,"
	+ "contato,"
	+ "leu,"
	+ "lendo"
	+ ") VALUES(?,?,?,?,?,?)"
	+ ";";

	
	
	try {
	ps.setInt(1, p.getId());
	ps.setString(2, p.getNome());
	ps.setInt(3, p.getIdade());
	ps.setInt(4, p.getContato());
	ps.setInt(5, p.getLeu());
	ps.setInt(6, p.getLendo());

	
	
	
	int resultado = ps.executeUpdate();

	if(resultado == 1) {
	System.out.println(p.getNome()+ " INSERIDA COM SUCESSO!");
	}else {
	System.out.println("Erro na inserção ! =[");
	}

	}catch(SQLException e){
	System.out.println("Erro: "+e.getMessage());
	}finally {
	if(ps !=null) {
	try {
	ps.close();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	}
	}

}
	
	
	

	

	//select
	public void SelectF(int idPessoa){
	conexaosqlite conn = new conexaosqlite();

	
	conn.conectar();

	PreparedStatement ps = null;
	ResultSet rs = null;
	
	String sql = "SELECT * FROM pessoa WHERE id = ?;";
	
	
	
	try {
	
	ps = conn.criarPreparedStatement(sql);
	ps.setInt(1, idPessoa);
	rs = ps.executeQuery();

	while(rs.next()) {
	System.out.println("==================");
	System.out.println("Pessoa Selecionada");
	System.out.println("==================");

	System.out.println("ID >>"+rs.getInt("id"));
	System.out.println("NOME >>"+rs.getString("nome"));
	System.out.println("IDADE >>"+rs.getInt("idade"));
	System.out.println("CONTATO >>"+rs.getInt("contato"));
	System.out.println("JÁ LEU >>"+rs.getInt("leu"));
	System.out.println("ESTÁ LENDO >>"+rs.getInt("lendo"));
	System.out.println("\n ----------------");
	}

	} catch (SQLException e) {

	System.out.println("Erro >>"+e.getMessage());
	}finally {
	
	try {
	rs.close();
	conn.desconectar();

	} catch (SQLException e) {
	System.out.println("Erro no fechamento!");

	}

	}
}

	//UPDATE
	public void UpdateF(Pessoa p1){
	String sqlUpdate = "UPDATE pessoa"
	+ " SET"
	+ " nome = ?,"
	+ " idade = ?,"
	+ " contato = ?,"
	+ " leu = ?,"
	+ "lendo = ?"
	+ " WHERE id = ?";


	try {
	System.out.println("==================");
	
	
	
	
	
	conexaosqlite conn = new conexaosqlite();
	
	conn.conectar();
	
	PreparedStatement ps = null;
	
	
	ps = conn.criarPreparedStatement(sqlUpdate);
	ps.setString(1, p1.getNome());
	ps.setInt(2, p1.getIdade());
	ps.setInt(3, p1.getContato());
	ps.setInt(4, p1.getLeu());
	ps.setInt(5, p1.getLendo());


	ps.executeUpdate();
	System.out.println("Pessoa Atualizada!");
	System.out.println("==================");

	} catch (SQLException e) {
	System.out.println("Erro no fechamento!");
	e.printStackTrace();


	}finally {

		/*try {
			rs.close();
			conn.desconectar();

			} catch (SQLException e) {
			System.out.println("Erro no fechamento!");

			}
*/
	}
}

	//DELETE
	public void DeleteF(int idPessoa){
	String sqlDelete = "DELETE FROM pessoa"
	+ " WHERE id = ?";
	
	conexaosqlite conn = new conexaosqlite();
	CriarBancoSQLite criarBancoSQLite = new CriarBancoSQLite(conn);
	conn.conectar();

	PreparedStatement ps = null;
	ResultSet rs = null;
	
	try {
	System.out.println("==================");
	ps = conn.criarPreparedStatement(sqlDelete);
	ps.setInt(1, idPessoa);
	int linhasDeletadas = ps.executeUpdate();

	System.out.println("Foram deletados "+linhasDeletadas+" registros");
	System.out.println("==================");

	} catch (SQLException e) {
	e.printStackTrace();
	}finally {
	conn.desconectar();
	}
	}
	
	
	
	
	
	
	
	
	//Insert Livros
	public void InsertL(Livros l){
			
		conexaosqlite conn = new conexaosqlite();
		CriarBancoSQLite criarBancoSQLite = new CriarBancoSQLite(conn);
		conn.conectar();

		PreparedStatement ps = null;
		ResultSet rs = null;
				
				
				
				
			
				

			String sqlInsert = "INSERT INTO livros ("
			+ "idlivro,"
			+ "nomelivro,"
			+ "genero,"
			+ "autor,"
			+ "paginas,"
			+ "quantidade"
			+ ") VALUES(?,?,?,?,?,?)"
			+ ";";

		
			try {
			ps.setInt(1, l.getIdlivro());
			ps.setString(2, l.getNomeLivro());
			ps.setString(3, l.getGenero());
			ps.setString(4, l.getAutor());
			ps.setInt(5, l.getPaginas());
			ps.setInt(6, l.getQuantidade());
			
			
			int resultado = ps.executeUpdate();

			if(resultado == 1) {
			System.out.println(l.getNomeLivro()+ " INSERIDA COM SUCESSO!");
			}else {
			System.out.println("Erro na inserção ! =[");
			}

			}catch(SQLException e){
			System.out.println("Erro: "+e.getMessage());
			}finally {
			if(ps !=null) {
			try {
			ps.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			}

			}
			
	
	
			
			
			
			
			//select livros
	public void SelectL(int idlivro){
			conexaosqlite conn = new conexaosqlite();
			CriarBancoSQLite criarBancoSQLite = new CriarBancoSQLite(conn);

			conn.conectar();

			PreparedStatement ps = null;
			ResultSet rs = null;
			
			String sql = "SELECT * FROM livros WHERE idlivro = ?;";

			try {
			
			ps = conn.criarPreparedStatement(sql);
			ps.setInt(1, idlivro);
			rs = ps.executeQuery();

			while(rs.next()) {
			System.out.println("==================");
			System.out.println("Livro Selecionado");
			System.out.println("==================");

			System.out.println("ID DO LIVRO >>"+rs.getInt("idlivro"));
			System.out.println("NOME DO LIVRO >>"+rs.getString("nomelivro"));
			System.out.println("GENERO DO LIVRO >>"+rs.getString("genero"));
			System.out.println("AUTOR DO LIVRO >>"+rs.getString("autor"));
			System.out.println("NUMERO DE PAGINAS >>"+rs.getInt("paginas"));
			System.out.println("QUANTIDADE DO LIVRO >>"+rs.getInt("quantidade"));
			System.out.println("\n ----------------");
			}

			} catch (SQLException e) {

			System.out.println("Erro >>"+e.getMessage());
			}finally {
			
			try {
			rs.close();
			conn.desconectar();

			} catch (SQLException e) {
			System.out.println("Erro no fechamento!");

			}

			}
			}		
	
	
	
			
			
			
			
			//UPDATE Livros
	public void UpdateL(Livros l1){
			String sqlUpdate = "UPDATE livros"
			+ " SET"
			+ " nomelivro = ?,"
			+ " genero = ?,"
			+ " autor = ?,"
			+ " paginas = ?,"
			+ " quantidade = ?"
			+ " WHERE idlivro = ?";


			try {
			System.out.println("==================");
			

			conexaosqlite conn = new conexaosqlite();
			CriarBancoSQLite criarBancoSQLite = new CriarBancoSQLite(conn);
			conn.conectar();

			PreparedStatement ps = null;
			ResultSet rs = null;
			
			ps = conn.criarPreparedStatement(sqlUpdate);
			ps.setString(1, l1.getNomeLivro());
			ps.setString(2, l1.getGenero());
			ps.setString(3, l1.getAutor());
			ps.setInt(4, l1.getPaginas());
			ps.setInt(5, l1.getQuantidade());
			

			ps.executeUpdate();
			System.out.println("Livro Atualizado!");
			System.out.println("==================");

			} catch (SQLException e) {
			System.out.println("Erro no fechamento!");
			e.printStackTrace();


			}finally {

				/*try {
					rs.close();
					conn.desconectar();

					} catch (SQLException e) {
					System.out.println("Erro no fechamento!");

					}
*/
			}
			}

			
			
			
			
			
			
			
			
			
			
			//DELETE livros
	public void DeleteL(int idlivro){
		
		conexaosqlite conn = new conexaosqlite();
		CriarBancoSQLite criarBancoSQLite = new CriarBancoSQLite(conn);

		conn.conectar();

		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner leia = new Scanner (System.in);
			String sqlDelete = "DELETE FROM livros"
			+ " WHERE idlivro = ?";

			
			
			try {
			System.out.println("==================");
			ps = conn.criarPreparedStatement(sqlDelete);
			ps.setInt(1, idlivro);
			int linhasDeletadas = ps.executeUpdate();

			System.out.println("Foram deletados "+linhasDeletadas+" registros");
			System.out.println("==================");

			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			//conn.desconectar();
			}
			}
			
			
			
			
			
			
			
			
			
	
	
}

