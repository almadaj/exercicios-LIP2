package ProvaNP2.Questao06;

public class Funcionario {
    private int id;
    protected String nome;
    private static int contadorId = 0;

    public Funcionario(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Funcionario(String nome){
        this.id = setId();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int setId(){
        return ++contadorId;
    }
}

