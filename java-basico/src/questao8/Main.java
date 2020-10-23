package questao8;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o número: ");
		int num = scanner.nextInt();
		
		if (num > 0 && num < 11) {
			
			System.out.println("Tabuada: ");
			System.out.println(num*0);
			System.out.println(num*1);
			System.out.println(num*2);
			System.out.println(num*3);
			System.out.println(num*4);
			System.out.println(num*5);
			System.out.println(num*6);
			System.out.println(num*7);
			System.out.println(num*8);
			System.out.println(num*9);
		} else { 
			
			System.out.println("número inválido");
		}
	}

}
