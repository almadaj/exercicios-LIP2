package NP1.Questao006;

public class Livro {
    private String titulo;
    private Autor autor;
    public Livro(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}
