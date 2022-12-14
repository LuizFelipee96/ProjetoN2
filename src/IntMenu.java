public interface IntMenu {
    
    public void criaBanco();

    public void exibirMenuCliente();

    public void exibirMenuConta();

    public int getInt(String s);

    public int getOptionMenuCliente();

    public int getOptionMenuConta();

    public void inserirCliente(Banco banco);

    public void inserirConta(Banco banco);

    public String pegarNome();

	public void excluirCliente();

	public Cliente pesquisarCliente();

    public void printCliente();

	public void atualizarCliente();

    public void menuCliente(Banco banco);

}
