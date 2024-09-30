package NP1.Aula004;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public String nameCourse;
    public int code;
    public List<Student> students;
    public University university;

    public Course(String nameCourse, int code, University university) {
        this.nameCourse = nameCourse;
        this.code = code;
        students = new ArrayList<>();
        this.university = university;

    }

    public String getNameCourse() {
        return nameCourse;
    }

    public int getCode() {
        return code;
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void getAllStudent(){
        for (Student s:students) {
            System.out.println(s.getStudentName());
        }
    }
}
