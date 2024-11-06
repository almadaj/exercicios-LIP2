package ProvaNP2.Questao04;

public class Brinquedo extends Produto{
    public Brinquedo(String nome, double preco) {
        super(nome, preco);
    }

    public void atualizar(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("ID: " + this.getId());
    }
}
