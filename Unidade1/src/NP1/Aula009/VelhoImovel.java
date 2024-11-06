package NP1.Aula009;

public class VelhoImovel extends Imovel{
    private double desconto;

    public VelhoImovel(double desconto, double preco){
        super(preco);
        this.desconto = desconto;
    }

    public double getDesconto(){
        return desconto;
    }

    public double calculoImovelNovo(){
        return ((getDesconto()/100)*getPreco()) - getPreco();
    }
}
