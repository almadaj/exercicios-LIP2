package NP1.Questao006;

public class Main {
    public static void main(String[] args) {
        Autor j = new Autor("Juliano");
        Livro b = new Livro("Volta dos que não foram");
        b.setAutor(j);
        j.addLivro(b);
        Livro c = new Livro("Volta dos que não foram 2");
        c.setAutor(j);
        j.addLivro(c);
        System.out.println(b.getAutor().getNomeAutor());
        j.showLivros();
    }
}
