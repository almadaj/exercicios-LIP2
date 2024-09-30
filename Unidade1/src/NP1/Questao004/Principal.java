package NP1.Questao004;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta("Juliano");
        conta.depositar(20.00);
        conta.depositar(20.00);
        conta.showInfo();
    }
}
