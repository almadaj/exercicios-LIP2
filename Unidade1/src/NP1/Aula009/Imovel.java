package NP1.Aula009;

public class Imovel {
    private double preco;
    protected String endereco;

    public Imovel(double preco){
        this.preco = preco;
        this.endereco = "Sem endereço";
    }

    public double getPreco(){
        return preco;
    }

    public double calcularValorImovel(int porcentagem){
        return this.preco * porcentagem;
    }
}