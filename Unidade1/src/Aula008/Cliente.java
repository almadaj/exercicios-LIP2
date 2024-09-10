package Aula008;

import Aula007.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String email;
    private List<Venda> compras;
    public Cliente(int idPessoa, String nome) {
        super(idPessoa);
        setNome(nome);
        this.compras = new ArrayList<>();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getNome(){
        return nome;
    }

    public void addCompra(Venda venda){
        this.compras.add(venda);
    }
}
