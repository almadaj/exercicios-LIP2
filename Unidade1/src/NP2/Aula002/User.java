package NP2.Aula002;

public class User {
    private static int idAtual = 0;
    private int id;
    public User(){
        this.id = incrementarId();
    }

    public static int getIdAtual(){
        return idAtual;
    }
    public static int incrementarId(){
        return ++idAtual;
    }
    public int getId() {
        return id;
    }
}
