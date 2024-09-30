package NP1.Aula008;

public class Main {
    public static void main(String[] args) {
    Cliente c = new Cliente(12, "Lucas");
    Funcionario f = new Funcionario(15, "Fernando");
    Venda v = new Venda(14, c, f);
    c.addCompra(v);
    f.addVenda(v);
    f.showVendasFuncionario();
    }
}
