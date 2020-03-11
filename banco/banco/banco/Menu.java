package banco;
import java.util.Scanner;
import banco.Crud;
import banco.Livros;
import banco.Pessoa;
import banco.CriarBancoSQLite;
public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		int opcao = 0;
		Crud  c = new Crud();
		
		
		while(opcao != 9) {
		
		System.out.println("1- Cadastrar Cliente;");
		System.out.println("2- Buscar Cliente;");
		System.out.println("3- Editar Cliente;");
		System.out.println("4- Exclusão de Cliente;");
		System.out.println("5- Cadastrar Livro;");
		System.out.println("6- Buscar Livro;");
		System.out.println("7- Editar Livro;");
		System.out.println("8- Exclusão de Livro;");
		System.out.println("9- Sair;");
		opcao = leia.nextInt();
		
		
		switch (opcao) {
	
		case 1:
			System.out.println("1- Cadastrar Cliente;");
			
			Pessoa p= new Pessoa();
			
			
			System.out.println("informe o nome do cliente: ");
			String nome =leia.next();
			p.setNome(nome);
			System.out.println("informe a idade do cliente: ");
			int idade =leia.nextInt();
			p.setIdade(idade);
			System.out.println("informe o contato do cliente:");
			int contato =leia.nextInt();
			p.setContato(contato);
			System.out.println("informe quantos livros o cliente já leu aqui: ");
			int leu =leia.nextInt();
			p.setLeu(leu);
			System.out.println("informe quantos livros o cliente está lendo agora: ");
			int lendo =leia.nextInt();
			p.setLendo(lendo);
			
		c.InsertF(p);
			
			
			break;
		case 2:
			System.out.println("2- Buscar Cliente;");
			
			System.out.println("informe o id do cliente: ");
			int idPessoa =leia.nextInt();
			
			
			
			
			c.SelectF(idPessoa);
			
			
			break;
		case 3:
			System.out.println("3- Editar Cliente;");
			
			
			Pessoa p1= new Pessoa();
			
			
			System.out.println("informe o nome do cliente: ");
			nome =leia.next();
			p1.setNome(nome);
			System.out.println("informe a idade do cliente: ");
			idade =leia.nextInt();
			p1.setIdade(idade);
			System.out.println("informe o contato do cliente:");
			contato =leia.nextInt();
			p1.setContato(contato);
			System.out.println("informe quantos livros o cliente já leu aqui: ");
			leu =leia.nextInt();
			p1.setLeu(leu);
			System.out.println("informe quantos livros o cliente está lendo agora: ");
			lendo =leia.nextInt();
			p1.setLendo(lendo);
			
			
			
			c.UpdateF(p1);
			
			
			break;
		case 4:
			System.out.println("4- Exclusão de Cliente;");
			
			System.out.println("informe o id do cliente: ");
			idPessoa =leia.nextInt();

			c.DeleteF(idPessoa);
			
			
			break;
		case 5:
			System.out.println("5- Cadastrar Livro;");
			
			Livros l=new Livros();
			
			
			
			System.out.println("informe o nome do livro: ");
			String nomelivro =leia.next();
			l.setNomeLivro(nomelivro);
			System.out.println("informe o genero do livro: ");
			String genero =leia.next();
			l.setGenero(genero);
			System.out.println("informe o autor do livro: ");
			String autor =leia.next();
			l.setAutor(autor);
			System.out.println("informe a quantidade de paginas do livro: ");
			int paginas =leia.nextInt();
			l.setPaginas(paginas);
			System.out.println("informe quantidade de exemplares disponiveis desse livro : ");
			int quantidade =leia.nextInt();
			l.setQuantidade(quantidade);
			
			
			
			
			c.InsertL(l);
			
			
			break;
		case 6:
			System.out.println("6- Buscar Livro;");
			
			System.out.println("informe o id do livro: ");
			int idlivro =leia.nextInt();
			
			
			c.SelectL(idlivro);

			
			break;
			
		case 7:
			System.out.println("7- Editar Livro;");

			Livros l1=new Livros();
		
			
			
			System.out.println("informe o nome do livro: ");
			nomelivro =leia.next();
			l1.setNomeLivro(nomelivro);
			System.out.println("informe o genero do livro: ");
			genero =leia.next();
			l1.setGenero(genero);
			System.out.println("informe o autor do livro: ");
			autor =leia.next();
			l1.setAutor(autor);
			System.out.println("informe a quantidade de paginas do livro: ");
			paginas =leia.nextInt();
			l1.setPaginas(paginas);
			System.out.println("informe quantidade de exemplares disponiveis desse livro : ");
			quantidade =leia.nextInt();
			l1.setQuantidade(quantidade);
			
			
			
			c.UpdateL(l1);

			
			break;	
		
		case 8:
			System.out.println("8- Exclusão de Livro;");
			System.out.println("informe o id do livro: ");
			idlivro =leia.nextInt();
			c.DeleteL(idlivro);
			
			
			break;	
			
		case 9:
			System.out.println("9- Sair;");
			System.out.println("Sair");
			break;	
		default:
			System.out.println("opção invalida");
			break;
		

			
			
		}
			
			
		}	
			
			
	
		
		
		
		
		
		
	leia.close();		
	}

	}



	