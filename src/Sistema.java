import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Cliente> cadastros;

    public Sistema(){
        this.cadastros = new ArrayList<>();
    }
    public void iniciarSistema(){
        int operacaoEscolhida = listarOpcoes();
        while (operacaoEscolhida != 4) {
            if (operacaoEscolhida == 1) {
                cadastrarCliente();
            } else if (operacaoEscolhida == 2) {
                opcaoAlterar();

            } else if (operacaoEscolhida == 3) {
                listarClientes();
            }
             operacaoEscolhida = listarOpcoes();
        }
    }

    private int listarOpcoes(){
        System.out.println("Selecione 1 para cadastrar, 2 alterar um cadastro, 3 para listar. 4 para sair");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextInt();
    }

    private void cadastrarCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome");
         String nome = scanner.next();

        System.out.println("Digite a idade");
        int idade = scanner.nextInt();

        System.out.println("Digite o email");
        String email = scanner.next();

        Cliente cliente = new Cliente(nome, idade,email);
        cadastros.add(cliente);
    }
    private void opcaoAlterar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = scanner.next();

        for(int i = 0; i < cadastros.size(); i++){
            if(cadastros.get(i).getNome() == nome){
                System.out.println("Selecione 1 para alterar o nome, 2 a idaide e 3 email");
                int opcao = scanner.nextInt();
                alterarCliente(cadastros.get(i), opcao);
                break;
            }
        }

    }

    private void alterarCliente(Cliente cliente, int opcao){
        Scanner scanner = new Scanner(System.in);
        if(opcao == 1){
            System.out.println("Digite o novo nome");
            String novoNome = scanner.next();
            cliente.setNome(novoNome);
        }else if(opcao == 2){
            System.out.println("Digite a nova idade");
            int idade = scanner.nextInt();
            cliente.setIdade(idade);
        } else if(opcao == 3){
            System.out.println("Digite o novo email");
            String novoEmail = scanner.next();
            cliente.setNome(novoEmail);
        }
    }

    private void listarClientes(){
        for(int i = 0; i < cadastros.size(); i++){
            cadastros.get(i).exibirInformacoes();
        }
    }

}
