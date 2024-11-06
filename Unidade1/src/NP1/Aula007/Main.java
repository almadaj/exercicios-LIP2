package NP1.Aula007;

public class Main {
    public static void main(String[] args) {
        Departamento dep = new Departamento(1, "Sample");
        PessoaFisica pf = new PessoaFisica(1, "João");
        pf.setCpf("123456789");
        Pessoa pp = new Pessoa(123);
        dep.addPessoa(pf);
        dep.showPessoas();
    }
}
