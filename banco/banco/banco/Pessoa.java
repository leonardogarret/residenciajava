package banco;

public class Pessoa {

	private int id;
	private String nome;
	private int idade;
	private int contato;
	private int leu;
	private int lendo;
	
	
	
	
	
	
	
	public Pessoa() {
		super();
	}





	public Pessoa(int id, String nome) {
		
		this.id = id;
		this.nome = nome;
	}





	public Pessoa(int id) {
		
		this.id = id;
	}





	public Pessoa(String nome, int idade, int contato, int leu, int lendo) {
		
		this.nome = nome;
		this.idade = idade;
		this.contato = contato;
		this.leu = leu;
		this.lendo = lendo;
	}





	public Pessoa(int id, String nome, int idade, int contato, int leu, int lendo) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.contato = contato;
		this.leu = leu;
		this.lendo = lendo;
		
	}
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getContato() {
		return contato;
	}
	public void setContato(int contato) {
		this.contato = contato;
	}
	public int getLeu() {
		return leu;
	}
	public void setLeu(int leu) {
		this.leu = leu;
	}
	public int getLendo() {
		return lendo;
	}
	public void setLendo(int lendo) {
		this.lendo = lendo;	
	}

}
	
