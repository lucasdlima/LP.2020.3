package questao10;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira a velocidade: ");
		float vel = scanner.nextFloat();
		System.out.println("Insira o limite de velocidade: ");
		float lim = scanner.nextFloat();
		
		float dif = vel - lim;
		float multa = 0;
		
		if ((lim - vel) < 0 && (lim - vel) >= -10) {
			multa = 50;
			System.out.println("Multa: R$ " + multa);
		}else if ((lim - vel) < -10 && (lim - vel) >= -30){
			multa = 50 + (dif*5);
			System.out.println("Multa: R$ " + multa);
		}else if (((lim - vel) < -30)) {
			multa = 200 + (dif*10);
			System.out.println("Multa: R$ " + multa);
		}
		
	}

}
