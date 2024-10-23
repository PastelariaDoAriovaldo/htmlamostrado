package lpa_Aula_23;

public class ClassePrincipal3 {
	public static void main(String[] args) {


        Livro livro = new Livro("Harry Potter", "J.K. Rowling");
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", livro);

        System.out.println("Biblioteca: " + biblioteca.getNome());
        System.out.println("Livro: " + livro.getTitulo() + livro.getAutor());
    }
}