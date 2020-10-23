package questao5;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o salário mínimo: ");
		float smin = scanner.nextFloat();
		System.out.println("Insira o  seu salário: ");
		float s = scanner.nextInt();
		
		float total = s / smin;
		
		System.out.println("Você ganha " + total + " salários minímos.");
	}

}
