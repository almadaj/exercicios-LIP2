package ProvaNP2.Questao06;

public class Main {
    public static void main(String[] args) {
        Vendedor j = new Vendedor(1, "Juliano Almada");
        j.mostrarDados();
        j.fazerVenda();
        j.mostrarDados();

        Vendedor v = new Vendedor("Vitor Almeida");
        v.mostrarDados();
        Vendedor t = new Vendedor("Vitor Monteiro");
        t.mostrarDados();
    }
}
