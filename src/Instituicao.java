public abstract class Instituicao {
    protected String nome;
    protected String endereco;
    protected String contato;

    
    //metodos getters e setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getContato() {
        return contato;
    }
    
    public void setContato(String contato) {
        this.contato = contato;
    }

}
