package NP1.Aula006;

public class Doctor extends Person{
    private String medicalId;

    public Doctor(int id, String name, String email, String medicalId) {
        super(id, name);
        setEmail(email);
        this.medicalId = medicalId;
    }

    public String getMedicalId() {
        return medicalId;
    }
}
