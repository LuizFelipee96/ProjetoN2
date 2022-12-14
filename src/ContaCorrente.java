public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public ContaCorrente() {  //construtor sugerido pela IDE
        super();
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + (valor - 0.1);
    }

    public void imprimirExtrato() {
        System.out.println("#### Extrato de Conta Corrente #####");
        super.imprimirInfosComuns(); //metodo protegido para acesso de classes filhas
    }

}