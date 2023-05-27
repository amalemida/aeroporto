import java.util.Scanner;

public class AeroportoApp {

    public static void main(String[] args) {
        // Cadastramento dos aeroportos
        Aeroporto cnf = new Aeroporto("Belo Horizonte", "CNF");
        Aeroporto bsb = new Aeroporto("Brasília", "BSB");
        Aeroporto gig = new Aeroporto("Rio de Janeiro", "GIG");
        Aeroporto ssa = new Aeroporto("Salvador", "SSA");
        Aeroporto gru = new Aeroporto("São Paulo", "GRU");

        Aeroportos aeroportos = new Aeroportos(10);
        try {
            aeroportos.adicionarAeroporto(cnf);
            aeroportos.adicionarAeroporto(bsb);
            aeroportos.adicionarAeroporto(gig);
            aeroportos.adicionarAeroporto(ssa);
            aeroportos.adicionarAeroporto(gru);    
        } catch(Exception ex) {
            System.out.println("Erro ao cadastrar novo aeroporto: " + ex.getMessage());
        }
        
        // Menu
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Cadastrar novo aeroporto");
            System.out.println("2. Cadastrar voo");
            System.out.println("3. Remover voo");
            System.out.println("4. Listar voos de um aeroporto");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o newline deixado pelo nextInt()

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aeroporto:");
                    String nomeAeroporto = scanner.nextLine();
                    System.out.println("Digite o código do aeroporto:");
                    String codigoAeroporto = scanner.nextLine();

                    try {
                        Aeroporto novoAeroporto = new Aeroporto(nomeAeroporto, codigoAeroporto);                    
                        aeroportos.adicionarAeroporto(novoAeroporto);
                        System.out.println("Aeroporto cadastrado com sucesso!");
                    } catch(Exception ex) {
                        System.out.println("Erro ao cadastrar novo aeroporto: " + ex.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Digite o código do aeroporto de origem:");
                    String codigoOrigem = scanner.nextLine();
                    System.out.println("Digite o código do aeroporto de destino:");
                    String codigoDestino = scanner.nextLine();
                    System.out.println("Digite o número do voo:");
                    String numeroVoo = scanner.nextLine();

                    try {
                        aeroportos.cadastrarVoo(numeroVoo, codigoOrigem, codigoDestino);
                        System.out.println("Voo cadastrado com sucesso!");
                    } catch(Exception ex) {
                        System.out.println("Erro ao cadastrar voo: " + ex.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Digite o número do voo a ser removido:");
                    String vooRemover = scanner.nextLine();

                    try {
                        aeroportos.removerVoo(vooRemover);
                        System.out.println("Voo removido com sucesso!");
                    } catch(Exception ex) {
                        System.out.println("Erro ao remover voo: " + ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Digite o código do aeroporto para listar os voos:");
                    String codigoAeroportoListar = scanner.nextLine();

                    aeroportos.listarVoos(codigoAeroportoListar);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite um número válido.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}


