package questao3;

public class Main {
	
	public static void main(String[] args) {
		
		PessoaRica pessoaRica = new PessoaRica("Robert", 24, 999999);
		PessoaPobre pessoaPobre = new PessoaPobre("Zé de seu Toin", 39);
		PessoaMizeravel pessoaMizeravel = new PessoaMizeravel("Júa", 30);
		
		pessoaMizeravel.mendiga();
		pessoaPobre.trabalha();
		pessoaRica.fazCompras();
	}
}
