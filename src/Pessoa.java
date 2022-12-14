public abstract class Pessoa{

    protected String nome;
    protected String endereco;
    protected String idade;
    protected String sexo;
    protected String telefone;
    

    //metodos getters e setters de dados pessoais do cliente
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws FaltaDados {
        if (nome.isEmpty())
        {
            throw new FaltaDados();
        }
        else
        {
            this.nome = nome;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }




}