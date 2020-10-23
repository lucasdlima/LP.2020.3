package questao6;

public class Cliente {
	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		this.setCpf(cpf);
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
