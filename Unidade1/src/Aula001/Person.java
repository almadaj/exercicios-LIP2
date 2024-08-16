package Aula001;
import java.time.Year;
public class Person {
    public String name;
    public int yearBirth;
    public int height;

    void showInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Year of Birth: "+ yearBirth);
        System.out.println("Height "+ height);
    }
    void getAge(){
        int year = Year.now().getValue();
        System.out.println(name + " has " + (year - yearBirth) + " years-old");
    }
}
