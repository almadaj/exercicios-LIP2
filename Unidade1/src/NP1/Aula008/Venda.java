package NP1.Aula008;

import NP1.Aula007.Departamento;

import java.util.Date;

public class Venda {
    private int codigo;
    public Date data;
    public Funcionario funcionario;
    public Cliente cliente;

    public Venda(int codigo, Cliente cliente, Funcionario funcionario){
        this.codigo = codigo;
        this.data = new Date();
        this.cliente = cliente;
        this.funcionario = funcionario;

    }

    public void setVendedor(Funcionario vendedor){
        this.funcionario = vendedor;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void showInfo(){
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Funcionário: " + this.funcionario.getNome());
        System.out.println("Data: " + this.data);
    }

}
