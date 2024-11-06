package NP2.ProvaNP2.Questao04;

abstract class Produto {
    public String nome;
    public double preco;
    private int id;
    private static int contadorId = 0;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.id = setId();
    }

    public static int setId(){
        return contadorId++;
    }

    public int getId() {
        return id;
    }

    public abstract void atualizar(String nome, double preco);
    public abstract void mostrarDados();
}
