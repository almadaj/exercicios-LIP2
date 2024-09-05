package Aula006;

public class Person {
    private int id;
    protected String name;
    public String email;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        this.email = "No Email";
    }
    public String getName() {
        return name;
    }
    protected void setEmail(String email){
        this.email = email;
    }
}
