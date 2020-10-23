package questao4;

public class Main {
	
	public static void main(String[] args) {
		
		Bola bola = new Bola("Azul e Amarela", 10);
		System.out.println("Cor: " + bola.getCor() + ".  Tamanho: " + bola.getTam());
		System.out.println("Cheia: " + bola.isBola());
		bola.encher();
		System.out.println("Cheia: " + bola.isBola());
	}

}
