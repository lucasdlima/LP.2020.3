package questao4;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira os anos: ");
		int ano = scanner.nextInt();
		System.out.println("Insira os meses: ");
		int mes = scanner.nextInt();
		System.out.println("Insira os dias: ");
		int dia = scanner.nextInt();
		
		int x = ano * 365;
		int y = mes * 30;
		int total = x + y + dia;
		
		System.out.println("Total = " + total);
	}
}
