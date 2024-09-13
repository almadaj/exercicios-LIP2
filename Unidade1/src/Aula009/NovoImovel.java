package Aula009;

public class NovoImovel extends Imovel{
    private double adicional;

    public NovoImovel(double adicional, double preco){
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