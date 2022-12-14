public class Cliente extends Pessoa {

    private Banco banco;

    public Cliente() {
    } 

    public Cliente(String nome, Banco banco, String idade, String sexo, String telefone) {
        this.nome = nome;
        this.banco = banco;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.banco.clientes.add(this);
    }

    public Cliente(String nome, String endereco, Banco banco, String idade, String sexo, String telefone) {
        this.nome = nome;
        this.banco = banco;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
        this.banco.clientes.add(this);
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    @Override
    public String toString() {  //configurado toString pra mostrar lista com nomes de banco e cliente
        return "Cliente {" +
                "banco=" + banco.nome + ", nome='" + this.getNome() +
                '}';
    }
}