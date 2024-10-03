package NP1.Ex05;

public class Main {
    public static void main(String[] args) {
    Funcionario f = new Funcionario(123, "Fábio");
    Cliente c = new Cliente(321, "cliente@cc.com");
    Venda v = new Venda(555);
    c.addCompra(v);
    f.addVenda(v);

    f.showVendasFuncionario();


    }
}
