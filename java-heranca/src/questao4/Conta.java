package questao4;

public class Conta {
	private int numero;
	public float saldo;
	private Cliente cliente;
	
	public Conta(int numero, float saldo, Cliente cliente) {
		this.setNumero(numero);
		this.setSaldo(saldo);
		this.setCliente(cliente);
	}
	
	public void sacar(float valor) {
		if (valor < this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositar(float valor) {
		this.saldo += valor;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
