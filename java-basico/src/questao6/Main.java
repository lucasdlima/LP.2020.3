package questao6;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o 1� n�mero: ");
		int um = scanner.nextInt();
		System.out.println("Insira o 2� n�mero: ");
		int dois = scanner.nextInt();
		System.out.println("Insira o 3� n�mero: ");
		int tres = scanner.nextInt();
		
		float media = (um + dois + tres) / 3;
		System.out.println("1� M�dia = " + media);
		
		System.out.println("Insira o 1� n�mero: ");
		int u = scanner.nextInt();
		System.out.println("Insira o 2� n�mero: ");
		int doi = scanner.nextInt();
		System.out.println("Insira o 3� n�mero: ");
		int tre = scanner.nextInt();
		
		float medi = (u + doi + tre) / 3;
		System.out.println("2� M�dia = " + medi);
		
		float soma = media + medi;
		float medias = soma / 2;
		
		System.out.println("Soma das m�dias = " + soma + " M�dia geral = " + medias);
		
	}

}
