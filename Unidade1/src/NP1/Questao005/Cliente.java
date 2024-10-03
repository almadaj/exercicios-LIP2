package NP1.Questao005;


import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos;

    public Cliente(String nome){
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public void addPedidos(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public void showPedidos(){
        double aux = 0;
        for(Pedido p:pedidos){
            aux += p.getTotal();
        }
        System.out.printf("Valor total: R$%.2f", aux);
    }
}
