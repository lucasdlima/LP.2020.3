package questao7;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o nome do aluno: ");
		String nome = scanner.next();
		System.out.println("Insira a 1� nota: ");
		float nota1 = scanner.nextFloat();
		System.out.println("Insira o 2� nota: ");
		float nota2 = scanner.nextFloat();
		
		float media = (nota1 + nota2) /2;
		
		if (media >= 7) {
			
			System.out.println("O aluno " + nome + " est� aprovado!");
			
		}else {
			
			System.out.println("O aluno " + nome + " est� reprovado!");
		}
	}

}
