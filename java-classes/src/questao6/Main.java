package questao6;

public class Main {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Lucas de Lima", "101.102.103-04");
		Conta conta = new Conta(001, "Inter", cliente);
		
		
		conta.deposito(50);
		conta.saque(20);
		System.out.println("saldo atual: " + conta.getSaldo());
		conta.saque(30);
		System.out.println("saldo atual: " + conta.getSaldo());
	}

}
