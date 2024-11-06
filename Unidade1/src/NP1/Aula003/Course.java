package NP1.Aula003;

public class Course {
    public String nameCourse;
    public int idCourse;
    public Professor professor;

    Course(String nameCourse, int idCourse, Professor professor){
        this.nameCourse = nameCourse;
        this.idCourse = idCourse;
        this.professor = professor;
    }

    public int getIdCourse(){
        return idCourse;
    }

    public String getProfessorName(){
        return professor.getName();
    }

    public String getNameCourse() {
        return nameCourse;
    }
}
