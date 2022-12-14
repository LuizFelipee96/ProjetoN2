import java.util.*;
public class Menu {
    Scanner sc = new Scanner(System.in);
	ArrayList<Banco> bancos = new ArrayList<Banco>();
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Conta> contas = new ArrayList<Conta>();

    public void criaBanco(){
        Banco banco = new Banco(); //instancia novo banco

        System.out.println("Digite o nome do banco: ");
        String nomeBanco = sc.nextLine();
        
        banco.setNome(nomeBanco); //insere nome do banco
        menuCliente(banco);
    }

    public void exibirMenuCliente() {
		System.out.println("Menu: \n\n" + "1. Inserir cliente\r\n" + "2. Excluir cliente\r\n"
				+ "3. Pesquisar cliente\r\n" + "4. Atualizar cliente\r\n" + "5. Menu Conta\r\n" + "0. Sair\n");
	}

    public void exibirMenuConta() {
		System.out.println("Menu: \n\n" + "1. Criar conta\r\n" + "2. Cancelar conta\r\n"
				+ "3. Pesquisar conta\r\n" + "4. Atualizar conta\r\n" + "0. Voltar\n");
	}

    public int getInt(String s) {
		int input;
		while (!sc.hasNextInt()) {
			System.out.println(s);
			sc.next();
		}
		input = sc.nextInt();
		sc.nextLine();
		return input;
	}

    public int getOptionMenuCliente() {
		exibirMenuCliente();
		System.out.print("Digite a opção que você deseja: ");
		int option = getInt("Digite a opção que você deseja: ");
		System.out.println("\n\n");

		return option;
	}

    public int getOptionMenuConta() {
		exibirMenuConta();
		System.out.print("Digite a opção que você deseja: ");
		int option = getInt("Digite a opção que você deseja: ");
		System.out.println("\n\n");

		return option;
	}

    public void inserirCliente(Banco banco){
        Cliente cliente = new Cliente();

		String nome = "";
		System.out.print("Digite o nome do(a) Cliente(a): ");
		System.out.println();
		nome = sc.nextLine();

        String idade = "";
		System.out.print("Digite a idade do(a) Cliente(a): ");
		System.out.println();
		idade = sc.nextLine();

        String sexo = "";
		System.out.print("Digite o sexo do(a) Cliente(a): ");
		System.out.println();
		sexo = sc.nextLine();

        String telefone = "";
		System.out.print("Digite o telefone do(a) Cliente(a): ");
		System.out.println();
		telefone = sc.nextLine();

        System.out.println("Você deseja inserir o endereço deste Cliente?\n1- Sim\n2- Não");
		int option = getInt("");
        if (option == 1) {
            String endereco = "";
            System.out.print("Digite o endereço do(a) Cliente(a): ");
            System.out.println();
            endereco = sc.nextLine();
            cliente = new Cliente(nome, endereco, banco, idade, sexo, telefone);
        } else {
            cliente = new Cliente(nome, banco, idade, sexo, telefone);
        }
		clientes.add(cliente);

        
    }

    public void inserirConta(Banco banco){
        System.out.println("Qual conta deseja criar? \n1- Corrente\n2- Poupança");
        int i = Integer.parseInt(sc.nextLine());
        if (i==1) {
            Conta cc = new ContaCorrente();
            Cliente clienteEncontrado = new Cliente();
            clienteEncontrado = pesquisarCliente(); 
            cc = new ContaCorrente(clienteEncontrado);
            contas.add(cc);
            System.out.print("Conta corrente criada para "+clienteEncontrado.nome+" no banco "+banco.nome);
            System.out.println();
        } else  if (i==2) {
            Conta cp = new ContaPoupanca();
            Cliente clienteEncontrado = new Cliente();
            clienteEncontrado = pesquisarCliente();
            cp = new ContaPoupanca(clienteEncontrado);
            contas.add(cp);
            System.out.println("Conta poupança criada para "+clienteEncontrado.nome +" no banco "+banco.nome);
            System.out.println();
        }else{
            System.out.println("Opção inválida");
        }
    }

    public String pegarNome() {
		System.out.print("Digite o nome do(a) cliente(a) que você deseja encontrar: ");
		String nome = sc.nextLine();

		return nome;
	}

	public void excluirCliente() {
		String nome = pegarNome();

		clientes.removeIf(cliente -> (cliente.getNome().equals(nome)));
		System.out.println(clientes.toString());
	}

	public Cliente pesquisarCliente() {
		String nome = pegarNome();

		Cliente clienteEncontrado = new Cliente();
		for (Cliente cliente : clientes) {
			if (cliente.getNome().equals(nome)) {
				clienteEncontrado = cliente;
				break;
			}
		}
		return clienteEncontrado;
	}

    public void printCliente(Banco banco){
        Cliente clienteEncontrado = new Cliente();
        clienteEncontrado = pesquisarCliente();
        System.out.println("================================");
        System.out.println("\nNome: " + clienteEncontrado.nome);
        System.out.println("Endereço: " + clienteEncontrado.endereco);
        System.out.println("Idade: " + clienteEncontrado.idade);
        System.out.println("Sexo: " + clienteEncontrado.sexo);
        System.out.println("Telefone: " + clienteEncontrado.telefone);
        System.out.println("Banco: " + banco.nome);
		System.out.println("Conta: " + contas);
        System.out.println("\n================================");
        System.out.println();
    }
    
	public void atualizarCliente() {
		Cliente cliente = pesquisarCliente();
		String endereco = "";

		System.out.println("Digite o novo endereço do(a) cliente(a): ");
		endereco = sc.nextLine();
		cliente.setEndereco(endereco);

	}

    public void menuCliente(Banco banco) {
		int option = getOptionMenuCliente();

		while (option != 0) {
			switch (option) {
			case 1:
				inserirCliente(banco);
				break;
			case 2:
                excluirCliente();
                break;
			case 3:
                printCliente(banco);
				break;
			case 4:
                atualizarCliente();
				break;
            case 5:
                inserirConta(banco);
                break;
			default:
				System.out.println("Você escolheu uma opção inválida. Por favor, digite novamente.");
				break;
			}
			option = getOptionMenuCliente();
		}
		System.out.println("Obrigado por usar o nosso programa.");
	}

}

