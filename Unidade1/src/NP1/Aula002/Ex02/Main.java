package NP1.Aula002.Ex02;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor ("Juliano", 123);
        Disciplina poo = new Disciplina (312, "POO");
        poo.setProfessor(p);
        p.setDisciplina(poo);
        System.out.println("Professor: " + poo.getProfessor());
        System.out.println("Disciplina: " + p.getDisciplina());
    }
}
