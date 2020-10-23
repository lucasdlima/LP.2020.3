package questao4;

public class ContaPoupanca extends Conta {
	private float rendimento;

	public ContaPoupanca(int numeroCp, float saldo, Cliente cliente, float rendimento) {
		super(numeroCp, saldo, cliente);
		this.rendimento = rendimento;
	}

	public void render() {
		float rendido = this.saldo * this.rendimento;
		this.saldo += rendido;
	}
	
	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

}
