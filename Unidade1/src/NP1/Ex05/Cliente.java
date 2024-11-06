package NP1.Ex05;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    private String email;
    private List<Venda> compras;

    public Cliente(int codigo, String email){
        super(codigo);
        this.email = email;
        this.compras = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
    public void addCompra(Venda compras){
        this.compras.add(compras);
    }
    public void showComprasCliente(){
        for(Venda v:compras){
            v.getCodigoVenda();
        }
    }
}
