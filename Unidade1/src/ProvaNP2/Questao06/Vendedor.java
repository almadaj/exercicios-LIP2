package ProvaNP2.Questao06;

public class Vendedor extends Funcionario {
    private int qtdeVendas;
    private static int id = 0;
    public Vendedor(int id, String nome) {
        super(id, nome);
        this.qtdeVendas = 0;
    }

    public Vendedor(String nome) {
        super(nome);
        this.getId();
        this.qtdeVendas = 0;
    }


    public void mostrarDados() {
        System.out.println("Nome: " + getNome() + ", ID: " + getId() + ", Quantidade de Vendas: " + qtdeVendas);
    }

    public void fazerVenda(){
        qtdeVendas++;
        System.out.println("Venda realizada!");
    }
}
