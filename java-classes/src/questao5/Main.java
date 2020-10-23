package questao5;

public class Main {
	
	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		
		elevador.entrar();
		System.out.println("Pessoas presentes: " + elevador.getPessoas());
		
		elevador.sair();
		System.out.println("Pessoas presentes: " + elevador.getPessoas());
		
		elevador.subir();
		System.out.println("andar atual: " + elevador.getAndar());
		
		elevador.descer();
		System.out.println("andar atual: " + elevador.getAndar());
		
	}

}
