package NP2.ProvaNP2.Questao05;

public class ContaCorrente implements OperacoesBancarias{
    private double montante;

    public ContaCorrente(){
        this.montante = 0.0;
    }

    public ContaCorrente(double montante){
        this.montante = montante;
    }

    @Override
    public void depositar(double quantia) {
        montante += quantia;
        System.out.println("Depósito realizado: R$ " + quantia);
    }

    @Override
    public void sacar(double quantia) {
        double taxa = 0.05 * quantia;
        double totalDebitado = quantia + taxa;
        montante -= totalDebitado;
        System.out.println("Saque realizado: R$ " + quantia + " | Taxa: R$ " + taxa);

    }

    @Override
    public double saldo() {
        System.out.println("Saldo: R$" + montante);
        return montante;
    }
}
