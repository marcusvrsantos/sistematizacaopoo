import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciarFuncionario gerenciamento = new GerenciarFuncionario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpção 1 - Adicionar funcionário");
            System.out.println("Opção 2 - Listar funcionários");
            System.out.println("Opção 3 - Buscar funcionário por ID");
            System.out.println("Opção 4 - Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                System.out.print("Digite a ID do funcionário: ");
                String id = scanner.nextLine();
                System.out.print("Nome do funcionário: ");
                String nome = scanner.nextLine();
                System.out.print("Possui alergias: ");
                String alergias = scanner.nextLine();
                System.out.print("Possui alguma condição médica: ");
                String condicaoMedica = scanner.nextLine();
                System.out.print("Telefone do funcionário: ");
                String telefone = scanner.nextLine();
                System.out.print("E-mail do funcionário: ");
                String email = scanner.nextLine();

                System.out.print("Nome do Contato de Emergência: ");
                String nomeContato = scanner.nextLine();
                System.out.print("Telefone do Contato de Emergência: ");
                String telefoneContato = scanner.nextLine();
                System.out.print("Email do Contato de Emergência: ");
                String emailContato = scanner.nextLine();

                ContatoEmergencia contatoEmergencia = new ContatoEmergencia(nomeContato, telefoneContato, emailContato);
                Funcionario novoFuncionario = new Funcionario(id, nome, alergias, condicaoMedica, telefone, email, contatoEmergencia);
                gerenciamento.adicionarFuncionario(novoFuncionario);
                System.out.println("Funcionário registrado com sucesso!");

            } else if (escolha == 2) {
                gerenciamento.listarFuncionarios();

            } else if (escolha == 3) {
                System.out.print("ID do funcionário: ");
                String id = scanner.nextLine();
                Funcionario funcionario = gerenciamento.buscarFuncionarioPorId(id);
                if (funcionario != null) {
                    System.out.println(funcionario);
                } else {
                    System.out.println("Funcionário não encontrado.");
                }

            } else if (escolha == 4) {
                System.out.println("Encerrando o programa.");
                break;

            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }
}

