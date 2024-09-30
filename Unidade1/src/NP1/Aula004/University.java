package NP1.Aula004;
import java.util.ArrayList;
import java.util.List;

public class University {
    public String nameUniversity;
    public String description;
    public List<Course> courses;


    public University(String nameUniversity, String description) {
        this.nameUniversity = nameUniversity;
        this.description = description;
        courses = new ArrayList<>();
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void AddCourse(Course course){
        courses.add(course);
    }
    public void getAllCourses(){
        for (Course c:courses) {
            System.out.println(c.getNameCourse());
        }
    }
    public int getTotalStudents(){
        int acc = 0;
        for (Course c:courses) {
            acc += c.students.size();
        }
        return acc;
    }
}
