package questao11;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o número: ");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			
			System.out.println("Par!");
		}else {
			
			System.out.println("Impar!");
		}
	}

}
