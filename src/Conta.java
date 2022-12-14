public abstract class Conta implements IntConta {

    //visibilidade protected para acesso pelas classes filhas
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    //metodo construtor da classe Conta
    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta() { //construtor vazio sugerido pela IDE
    }
    //metodos get e set descartados pra impedir edição externa de dados da conta
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    //sobrescreve toString
    @Override
    public String toString() {
        return "Conta{" +
                " numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }

    //metodo para imprimir informações comuns em extratos
    protected void imprimirInfosComuns() {
        System.out.printf(String.format("Titular: %s%n", this.cliente.getNome()));
        System.out.printf(String.format("Número: %d%n", this.numero));
        System.out.printf(String.format("Saldo: %.2f%n", this.saldo));
    }

    //implementação de metodos da interface IConta
    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;

    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void imprimirExtrato() {

    }

}