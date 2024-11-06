package NP1.Aula003;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    public String name;
    public int id;
    public List<Course> courses;

    public Professor(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void AddCourse(Course course){
        courses.add(course);
    }
    public void getAllCourses(){
        for (Course c:courses) {
            System.out.println(c.getNameCourse());
        }
    }
}
