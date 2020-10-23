package questao4;

public class ContaCorrente extends Conta {
	
	private String numeroCartao;
	
	public ContaCorrente(int numeroCc, float saldo, Cliente cliente, String numeroCartao) {
		super(numeroCc, saldo, cliente);
		this.setNumeroCartao(numeroCartao);
	}
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

}
