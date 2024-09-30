package NP1.Questao004;

public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome){
        this.nome = nome;
        this.saldo = 0;
    }

    public double depositar(double valor){
        double saldoAtual = getSaldo();
        saldoAtual += valor;
        setSaldo(saldoAtual);
         return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNome(){
        return nome;
    }
    public void showInfo(){
        System.out.println("Proprietário: " + this.getNome());
        System.out.printf("Saldo em caixa: R$%.2f", this.getSaldo());
    }
}
