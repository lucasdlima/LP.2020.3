package questao7;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String login;
	private String senha;

	public Usuario(int id, String nome, String email, String login, String senha) {
		this.setId(id);
		this.setNome(nome);
		this.setEmail(email);
		this.setLogin(login);
		this.setSenha(senha);
	}
	
	public Emprestimo realizarEmprestimo(Livro livro) {
		Emprestimo emprestimo = new Emprestimo(1, "09/10/2020", this, livro);
		return emprestimo;
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;

	}
}
	
