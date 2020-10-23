package questao6;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o 1° número: ");
		int um = scanner.nextInt();
		System.out.println("Insira o 2° número: ");
		int dois = scanner.nextInt();
		System.out.println("Insira o 3° número: ");
		int tres = scanner.nextInt();
		
		float media = (um + dois + tres) / 3;
		System.out.println("1° Média = " + media);
		
		System.out.println("Insira o 1° número: ");
		int u = scanner.nextInt();
		System.out.println("Insira o 2° número: ");
		int doi = scanner.nextInt();
		System.out.println("Insira o 3° número: ");
		int tre = scanner.nextInt();
		
		float medi = (u + doi + tre) / 3;
		System.out.println("2° Média = " + medi);
		
		float soma = media + medi;
		float medias = soma / 2;
		
		System.out.println("Soma das médias = " + soma + " Média geral = " + medias);
		
	}

}
