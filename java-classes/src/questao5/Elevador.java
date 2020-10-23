package questao5;

import java.util.Scanner;

public class Elevador {
	
	private int andar;
	private int total;
	private int capacidade;
	private int pessoas;
	
	
	
	public Elevador() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o número total de andares: ");
		int total = scanner.nextInt();
		System.out.println("Insira a capacidade total do elevador: ");
		int capacidade = scanner.nextInt();
		this.inicializar(capacidade, total);
	}
	
	public void inicializar(int capacidade, int total) {	
		this.setCapacidade(capacidade);
		this.setTotal(total);
	}
	
	
	public void entrar() {
		System.out.println("Insira a quantidade de pessoas que desejam entrar: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		if(x < this.capacidade && this.pessoas < this.capacidade) {
			this.pessoas += x;
		} else {
			this.pessoas += this.capacidade;
			System.out.println("Lotado!");
		}	
	}
	
	public void sair() {
		System.out.println("Insira a quantidade de pessoas que desejam sair: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x < this.pessoas && this.pessoas > 0) {
			this.pessoas -= x;
		} else {
			this.pessoas = 0;
			System.out.println("O Elevador já está vazio :)");
		}
	}
	
	public void subir() {
		System.out.println("Insira a quantidade de andares que deseja subir: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if (x < this.total && this.andar < this.total) {
			this.andar += x;
		} else {
			this.andar = this.total;
			System.out.println("Você está na cobertura :)");
		}	
	}
	
	public void descer() {
		System.out.println("Insira a quantidade de andares que deseja descer: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if (x < this.total && this.andar > 0) {
			this.andar -= x;
		} else {
			this.andar = 0;
			System.out.println("Você está no terreo :)");
		}				
	}
	
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getPessoas() {
		return pessoas;
	}
	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}
	
	

}
