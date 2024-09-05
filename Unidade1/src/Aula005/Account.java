package Aula005;

public class Account{
  private double amount;

  public Account(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }

  public void addAmount(double deposit) {
    this.amount += deposit;
  }

  public void withdraw(double withdraw) {
    this.amount -= withdraw;
  }

}
