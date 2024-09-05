package Aula007;

public class PessoaFisica extends Pessoa{
    private String cpf;
    Departamento departamento;

    public PessoaFisica(int idPessoa, String nome){
        super(idPessoa);
        this.nome = nome;
        this.cpf = "noCPF";
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
}
