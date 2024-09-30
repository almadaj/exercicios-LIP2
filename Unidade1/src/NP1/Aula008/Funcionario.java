package NP1.Aula008;
import NP1.Aula007.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{
    protected double salario;
    private List<Venda> vendas;

    public Funcionario(int idPessoa, String nome){
        super(idPessoa);
        setNome(nome);
        this.vendas = new ArrayList<>();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome(){
        return nome;
  }
    public void addVenda(Venda venda){
        this.vendas.add(venda);
    }
    public void showVendasFuncionario(){
        for(Venda v:vendas){
            v.showInfo();
        }
    }
}
