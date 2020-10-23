package questao7;

public class Emprestimo {
	
	private int id;
	private String data;
	private String devolucao;
	private Usuario usuario;
	private Livro livro;
	
	
	public Emprestimo(int id, String data, Usuario usuario, Livro livro) {
		this.setId(id);
		this.setData(data);
		this.setLivro(livro);
		this.setUsuario(usuario);
	}

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getDevolucao() {
		return devolucao;
	}
	
	public void setDataDevolucao(String devolucao) {
		this.devolucao = devolucao;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
