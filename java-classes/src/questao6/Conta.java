package questao6;

public class Conta {
	
	private int numero;
	private String banco;
	private float saldo;
	private Cliente cliente;
	
	public Conta(int numero, String banco, Cliente cliente) {
		this.setNumero(numero);
		this.setBanco(banco);
		this.setCliente(cliente);
	}
	
	public void saque(float valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void deposito(float valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado!");
	}
		
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		banco = banco;
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
