package questao7;

public class Editora {
	
	private int id;
	private String nome;
	
	public Editora(int id, String nome) {
		this.setId(id);
		this.setNome(nome);
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

}
