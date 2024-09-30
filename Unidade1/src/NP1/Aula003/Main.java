package NP1.Aula003;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Juliano", 1234);
        Course poo = new Course("Programação Orientada a Objeto", 1234, p);
        Course alg = new Course("Algoritmos I", 3452, p);

        p.AddCourse(poo);
        p.AddCourse(alg);
        p.getAllCourses();
        System.out.println(poo.getProfessorName());

    }
}
