package NP1.Ex05;

import java.util.Date;

public class Venda {
    private int codigoVenda;
    public Date data;
    public Funcionario vendedor;
    public Cliente cliente;

    public Venda (int codigoVenda){
        this.codigoVenda = codigoVenda;
        this.data = new Date();
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }
}
