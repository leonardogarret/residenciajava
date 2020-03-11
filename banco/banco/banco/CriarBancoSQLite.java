package banco;
import java.sql.SQLException;
import java.sql.Statement;

import conexoes.conexaosqlite;

public class CriarBancoSQLite {

	//Atributos final devem ser inicializados no contrutor.
			private final conexaosqlite conexaoSQLite;

			public CriarBancoSQLite(conexaosqlite conexaoSQLite) {
			this.conexaoSQLite = conexaoSQLite;
			}

			//Método responsável por criar uma tabela

			public void criarTabelaPessoa() {

			String sql = "CREATE TABLE IF NOT EXISTS pessoa"
			+ "("
			+ "id integer AUTO_INCREMENT PRIMARY KEY,"
			+ "nome text NOT NULL,"
			+ "idade integer,"
			+ "contato integer,"
			+ "leu integer,"
			+ "lendo integer"
			+ ")";

			boolean conectou = false;

			try {
			conectou = this.conexaoSQLite.conectar();

			Statement stmt = this.conexaoSQLite.criarStatement();

			stmt.execute(sql);

			System.out.println("Tabela pessoa criada!");

			}catch(SQLException e) {
			System.out.println("Erro>>"+e.getMessage());
			}finally {
			if(conectou) {
			this.conexaoSQLite.desconectar();
			}
			}
			}

			
			
			
			public void criarTabeaLivros() {

				String sql = "CREATE TABLE IF NOT EXISTS livros"
				+ "("
				+ "idlivro integer AUTO_INCREMENT PRIMARY KEY,"
				+ "nomelivro text NOT NULL,"
				+ "genero text,"
				+ "autor text,"
				+ "paginas integer,"
				+ "quantidade integer"
				+ ")";

				boolean conectou = false;

				try {
				conectou = this.conexaoSQLite.conectar();

				Statement stmt = this.conexaoSQLite.criarStatement();

				stmt.execute(sql);

				System.out.println("Tabela livros criada!");

				}catch(SQLException e) {
				System.out.println("Erro>>"+e.getMessage());
				}finally {
				if(conectou) {
				this.conexaoSQLite.desconectar();
				}
				}
				}
			
			
			
			
			
			
			

			}




