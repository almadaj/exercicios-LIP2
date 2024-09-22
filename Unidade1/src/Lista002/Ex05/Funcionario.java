package Lista002.Ex05;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{
    private double salario;
    private List<Venda> vendas;

    public Funcionario(int codigo, String nome){
        super(codigo);
        this.nome = nome;
        this.vendas = new ArrayList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void addVenda(Venda venda){
        this.vendas.add(venda);
    }
    public void showVendasFuncionario(){
        for(Venda v:vendas){
            System.out.println(v.getCodigoVenda());
        }
    }
}
