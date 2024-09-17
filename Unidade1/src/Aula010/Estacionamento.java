package Aula010;

import java.util.Date;

public class Estacionamento {
    private String placa;
    private String modelo;
    private Date entrada;
    private Date saida;

    // Construtor padrão
    public Estacionamento() {
        this.placa = "";
        this.modelo = "";
        this.entrada = new Date();
        this.saida = null;
    }

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    // Método para imprimir dados do carro
    public void imprimirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Hora de Entrada: " + entrada);
        System.out.println("Hora de Saída: " + saida);
    }

    public double calcularDiferenca(){
        long diff = this.saida.getTime() - this.entrada.getTime();
        long diffSegundos = diff/1000;
        System.out.println("Diferença em segundos: " + diffSegundos);
        return diffSegundos * 1.5;
    }
}

