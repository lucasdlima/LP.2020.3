package questao5;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o sal�rio m�nimo: ");
		float smin = scanner.nextFloat();
		System.out.println("Insira o  seu sal�rio: ");
		float s = scanner.nextInt();
		
		float total = s / smin;
		
		System.out.println("Voc� ganha " + total + " sal�rios min�mos.");
	}

}
