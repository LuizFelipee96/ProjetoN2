import java.util.*;

public class Banco extends Instituicao {

    private List<Conta> contas;

    List<Cliente> clientes = new ArrayList<Cliente>();

    public Banco() {
    
    }

    //metodos getters e setters
    
    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void mostrarClientes() {

        System.out.println(clientes);
    }
}