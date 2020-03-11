package banco;

public class Livros {


	private int idlivro;
	private String nomeLivro;
	private String genero;
	private String autor;
	private int paginas;
	private int quantidade;
	
	
	
	
	public Livros() {
		super();
	}




	public Livros(int idlivro) {
		
		this.idlivro = idlivro;
	}




	public Livros(int idlivro, String nomeLivro) {
		
		this.idlivro = idlivro;
		this.nomeLivro = nomeLivro;
	}




	public Livros(String nomeLivro, String genero, String autor, int paginas, int quantidade) {
		
		this.nomeLivro = nomeLivro;
		this.genero = genero;
		this.autor = autor;
		this.paginas = paginas;
		this.quantidade = quantidade;
	}




	public Livros(int idlivro, String nomeLivro, String genero, String autor, int paginas, int quantidade) {
		
		this.idlivro = idlivro;
		this.nomeLivro = nomeLivro;
		this.genero = genero;
		this.autor = autor;
		this.paginas = paginas;
		this.quantidade = quantidade;
		
		
		
		
		
	}




	public int getIdlivro() {
		return idlivro;
	}




	public void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}




	public String getNomeLivro() {
		return nomeLivro;
	}




	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}




	public String getGenero() {
		return genero;
	}




	public void setGenero(String genero) {
		this.genero = genero;
	}




	public String getAutor() {
		return autor;
	}




	public void setAutor(String autor) {
		this.autor = autor;
	}




	public int getPaginas() {
		return paginas;
	}




	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}




	public int getQuantidade() {
		return quantidade;
	}




	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Livros(int idlivro, String nomeLivro, String genero, String autor, int paginas) {
		this.idlivro = idlivro;
		this.nomeLivro = nomeLivro;
		this.genero = genero;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	
	
	
	

}


