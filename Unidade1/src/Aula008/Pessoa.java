package Aula008;

public class Pessoa {
    private int codigo;
    protected String nome;

    public Pessoa(int codigo) {
        this.codigo = codigo;
        this.nome = "Sem Nome";
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(String nome){
        return nome;
    }
}
