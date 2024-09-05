package Aula005;

public class Main {
  public static void main(String[] args) {
  Account ac = new Account(0);

    System.out.println(ac.getAmount());
    ac.addAmount(10);
    System.out.println(ac.getAmount());
    ac.withdraw(3);
    System.out.println(ac.getAmount());
  }
}
