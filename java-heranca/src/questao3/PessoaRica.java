package questao3;

public class PessoaRica extends Pessoa {
	
	private float dinheiro;
	
	public PessoaRica(String nome, int idade, float dinheiro) {
		super(nome, idade);
		this.setDinheiro(dinheiro);
	}
	
	public void fazCompras() {
		System.out.println("Comprou.");
	}

	public float getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}

}
