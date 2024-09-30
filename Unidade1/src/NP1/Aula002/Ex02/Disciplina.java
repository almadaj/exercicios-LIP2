package NP1.Aula002.Ex02;

public class Disciplina {
    public int codigo;
    public String nomeDisciplina;
    public Professor profResp;

    Disciplina(int codigo, String nomeDisciplina) {
        this.codigo = codigo;
        this.nomeDisciplina = nomeDisciplina;
        this.profResp = null;
    }

    public void setProfessor(Professor profResp) {
        this.profResp = profResp;
    }

    public String getProfessor() {
        return profResp.nome;
    }
}
