package Aula009;

public class NovoImovel extends Imovel{
    private double adicional;

    public NovoImovel( double preco, double adicional ){
        super(preco);
        this.adicional = adicional;
    }

    public double getAdicional(){
        return adicional;
    }

    public double calculoImovelNovo(){
        return adicional + getPreco();
    }
}