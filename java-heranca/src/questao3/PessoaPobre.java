package questao3;

public class PessoaPobre extends Pessoa{
	
	public PessoaPobre(String nome, int idade) {
		super(nome, idade);
	}
	
	public void trabalha() {
		System.out.println("Trabalhou.");
	}

}
