package questao7;

public class Main {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor(01, "Naruto Uzumaki");
		Editora editora = new Editora(01, "Nitendo");
		Usuario usuario = new Usuario(01, "Pedro", "pedrinhoreidelas@hotmail.com", "pedrinhoreidelas", "nescau123");
		Livro livro = new Livro(01, "As Aventuras de Kakaroto", 1998, "123456789012", autor, editora);
		
		
		Emprestimo emprestimo = usuario.realizarEmprestimo(livro);
		
		System.out.println("Email do usuário que realizou o empréstimo: " + emprestimo.getUsuario().getEmail());
		System.out.println("Livro que foi emprestado: " + emprestimo.getLivro().getTitulo() + ".  Autor: " + emprestimo.getLivro().getAutor().getNome());
		
	}

}
