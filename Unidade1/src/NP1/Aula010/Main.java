package NP1.Aula010;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    Estacionamento estacionamento = new Estacionamento();
    estacionamento.setPlaca("ABC-1234");
    estacionamento.setModelo("Fusca");
    estacionamento.setEntrada(new Date());

    Thread.sleep(10000);
    estacionamento.setSaida(new Date());
    System.out.println(estacionamento.calcularDiferenca());

    }
}
