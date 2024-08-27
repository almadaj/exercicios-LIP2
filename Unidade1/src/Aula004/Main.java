package Aula004;

public class Main {
    public static void main(String[] args) {
        University christus = new University("Unichristus", "Centro Universitário");
        Course ads = new Course("Análise e Desenvolvimento de Sistemas", 123, christus);
        Course si = new Course("Sistemas de Informação", 321, christus);
        Course cc = new Course("Ciência da Computação", 456, christus);

        Student fulano = new Student("Fulano", "123", ads);
        Student ciclano = new Student("Clicano", "321", ads);
        Student john = new Student("John", "456", si);
        Student maria = new Student("Maria", "654", cc);

        christus.AddCourse(ads);
        christus.AddCourse(si);
        christus.AddCourse(cc);

        ads.addStudent(fulano);
        ads.addStudent(ciclano);
        si.addStudent(john);
        cc.addStudent(maria);

        ads.getAllStudent();

        christus.getAllCourses();
        System.out.println(christus.getTotalStudents());

    }
}
