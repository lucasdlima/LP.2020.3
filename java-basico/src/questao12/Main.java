package questao12;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		
		Random random = new Random();
		int numAleatorio = random.nextInt(100);
		
		while (num != numAleatorio) {
			System.out.println("Insira o número: ");
			int num2 = scanner.nextInt();
			num = num2;
			if (num > numAleatorio) {
				System.out.println("Menor");
				
			}else {
				
				System.out.println("Maior");
			}
		}
	}

}
