package questao4;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Epaminondas Caboclo Iluminata", "001.002.003.04");
		ContaCorrente contac = new ContaCorrente(0001, 00, cliente, "5545.4436.4421.7575");
		ContaPoupanca contap = new ContaPoupanca(0002, 00, cliente, 1);
		
		contac.depositar(500);
		contap.depositar(400);
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("10/02/2020 - Conta Poupança: R$" + contap.getSaldo());
		System.out.println("10/02/2020 - Conta Corrente: R$" + contac.getSaldo());
		contap.render();
		contac.sacar(150);
		System.out.println("10/03/2020 - Conta Poupança: R$" + contap.getSaldo());
		System.out.println("10/02/2020 - Conta Corrente: R$" + contac.getSaldo());
		
	}

}
