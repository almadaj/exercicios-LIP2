package NP1.Aula007;

public class Pessoa {
    private int idPessoa;
    protected String nome;

    public Pessoa(int idPessoa){
        this.idPessoa = idPessoa;
        this.nome = "Sem Nome";
    }

    protected int getIdPessoa(){
        return idPessoa;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
