package NP1.Aula009;

public class NovoImovelCorretor extends NovoImovel{
    private double comissao;
    public NovoImovelCorretor(double adicional, double preco, double comissao) {
        super(adicional, preco);
        this.comissao = comissao;
    }

    @Override
    public double calcularValorImovel(int porcentagem) {
        return (this.getPreco() + this.getAdicional() + comissao*getPreco());
    }
}