package Aula002.Ex02;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor ("Juliano", 123);
        Disciplina poo = new Disciplina (312, "POO");
        poo.setProfessor(p);
        System.out.println("Professor: " + poo.getProfessor());
    }
}
