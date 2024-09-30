package NP1.Aula002.Ex02;
public class Professor {
    public String nome;
    public int id;
    public Disciplina disciplina;

    public Professor (String nome, int id){
        this.nome = nome;
        this.id = id;
    }
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return disciplina.nomeDisciplina;
    }
}
