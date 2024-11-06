package NP2.ProvaNP2.Questao04;

public class Main {
    public static void main(String[] args) {
        Brinquedo bola = new Brinquedo("Bola", 19.90);
        bola.mostrarDados();

        bola.atualizar("Bola de Volei", 15.99);
        bola.mostrarDados();

        Brinquedo play = new Brinquedo("PlayStation 5", 2999.90);
        play.mostrarDados();
    }
}
