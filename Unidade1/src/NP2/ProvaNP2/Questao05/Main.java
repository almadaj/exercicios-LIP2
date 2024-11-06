package NP2.ProvaNP2.Questao05;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        cc.saldo();
        cc.depositar(50.00);
        cc.saldo();
        cc.sacar(10);
        cc.saldo();
    }
}
