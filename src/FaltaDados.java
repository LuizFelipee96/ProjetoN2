public class FaltaDados extends Exception{
    public String mensagem;
    FaltaDados()
    {
        this.mensagem = "Nome do Cliente é obrigatório!!";
    }
}
