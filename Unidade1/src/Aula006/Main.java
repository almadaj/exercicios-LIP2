package Aula006;

public class Main {
    public static void main(String[] args) {
    Person p  = new Person(1, "Fernando");
    Doctor dc  = new Doctor(2, "Fernando", "f@gmail.com", "CRM-CE987123");

    System.out.println(p.getName());
    System.out.println(dc.getName());
    System.out.println(dc.getMedicalId());
    }
}