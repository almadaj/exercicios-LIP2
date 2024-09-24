package NP1.Questao006;

import NP1.Questao005.Pedido;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private List<Livro> livros;

    public Autor(String nome){
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNomeAutor() {
        return nome;
    }

    public void addLivro(Livro livro){
        this.livros.add(livro);
    }

    public void showLivros(){
        double aux = 0;
        for(Livro l:livros){
            System.out.println(l.getTitulo());
        }
    }
}
