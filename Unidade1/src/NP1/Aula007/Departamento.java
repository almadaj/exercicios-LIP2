package NP1.Aula007;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int idDep;
    public String descricao;
    private List<Pessoa> pessoas;

    public Departamento(int idDep, String descricao){
        this.idDep = idDep;
        this.descricao = descricao;
        this.pessoas = new ArrayList<>();

    }
    protected void getIdDep(int idDep){
        this.idDep = idDep;
    }
    public void addPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }
    public void showPessoas(){
        for(Pessoa p:pessoas){
            System.out.println(p.getIdPessoa());
        }
    }
}
