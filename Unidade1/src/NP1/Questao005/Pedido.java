package NP1.Questao005;

public class Pedido {
    private int qtd;
    private double valor;
    private Cliente cliente;

    public Pedido(int qtd, double valor, Cliente cliente){
        this.qtd = qtd;
        this.valor = valor;
        this.cliente = cliente;
    }
    public double getValor(){
        return valor;
    }
    public double getTotal() {
        double total = valor * qtd;
        return total;
    }
}
