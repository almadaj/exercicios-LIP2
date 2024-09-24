package NP1.Questao005;

public class Main {
    public static void main(String[] args) {
        Cliente j = new Cliente("Juliano");
        Pedido p = new Pedido(3, 5.0, j);
        Pedido c = new Pedido(2, 2.0, j);
        j.addPedidos(p);
        j.addPedidos(c);
        j.showPedidos();
    }
}
