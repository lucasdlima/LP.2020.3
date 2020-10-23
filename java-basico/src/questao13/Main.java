package questao13;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 1;
		int soma = 0;
		while (num > 0) {
			System.out.println("Insira o número: ");
			int num2 = scanner.nextInt();		
			num = num2;
			if (num > 0) {
				soma += num2;
			}
			
		}
		System.out.println("Resultado: " + soma);
		
	}

}
