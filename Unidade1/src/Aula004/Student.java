package Aula004;

public class Student {
    public String name;
    public String numberId;
    public Course course;

    public Student(String name, String numberId, Course course) {
        this.name = name;
        this.numberId = numberId;
        this.course = course;
    }

    public String getStudentName() {
        return name;
    }

    public String getNumberId() {
        return numberId;
    }
}
