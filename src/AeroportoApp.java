public class AeroportoApp {

    public static void main(String[] args) throws Exception {
        // Cadastramento dos aeroportos
        Aeroporto cnf = new Aeroporto("BELO HORIZONTE", "CNF");
        Aeroporto bsb = new Aeroporto("BRASÍLIA", "BSB");
        Aeroporto gig = new Aeroporto("RIO DE JANEIRO", "GIG");
        Aeroporto ssa = new Aeroporto("SALVADOR", "SSA");
        Aeroporto gru = new Aeroporto("SÃO PAULO", "GRU");

        Aeroportos aeroportos = new Aeroportos(10);

        aeroportos.adicioneAeroporto(bsb);
        aeroportos.adicioneAeroporto(cnf);
        aeroportos.adicioneAeroporto(gig);
        aeroportos.adicioneAeroporto(ssa);
        aeroportos.adicioneAeroporto(gru);

        aeroportos.cadastreVoo("107", "BSB", "SSA");
        aeroportos.cadastreVoo("214", "CNF", "SSA");
        aeroportos.cadastreVoo("555", "CNF", "GIG");
        aeroportos.cadastreVoo("101", "CNF", "GRU");
        aeroportos.cadastreVoo("554", "GIG", "CNF");
        aeroportos.cadastreVoo("090", "GIG", "GRU");
        aeroportos.cadastreVoo("050", "GRU", "BSB");
        aeroportos.cadastreVoo("089", "GRU", "GIG");
        aeroportos.cadastreVoo("102", "GRU", "CNF");
        aeroportos.cadastreVoo("215", "SSA", "CNF");

        int opcao = -1;
        do {
            try {
                System.out.println("\nSelecione uma opção:");
                System.out.println("1. Cadastrar novo aeroporto");
                System.out.println("2. Cadastrar voo");
                System.out.println("3. Remover voo");
                System.out.println("4. Listar voos de um aeroporto");
                System.out.println("0. Sair");

                opcao = Teclado.getUmInt();

            } catch (Exception ex) {
                if (ex.getMessage().equals("Int invalido!")) {
                    ex.getSuppressed();
                }

            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aeroporto:");
                    String nomeAeroporto = Teclado.getUmString().toUpperCase();
                    System.out.println("Digite o código do aeroporto:");
                    String codigoAeroporto = Teclado.getUmString().toUpperCase();

                    try {
                        Aeroporto novoAeroporto = new Aeroporto();
                        novoAeroporto = novoAeroporto.cadastreAeroporto(nomeAeroporto, codigoAeroporto);
                        aeroportos.adicioneAeroporto(novoAeroporto);
                        
                        System.out.println("Aeroporto cadastrado com sucesso!");
                    } catch (Exception ex) {
                        System.err.println("Erro ao cadastrar novo aeroporto: " + ex.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Digite o código do aeroporto de origem:");
                    String codigoOrigem = Teclado.getUmString().toUpperCase();
                    System.out.println("Digite o código do aeroporto de destino:");
                    String codigoDestino = Teclado.getUmString().toUpperCase();
                    System.out.println("Digite o número do voo:");
                    String numeroVoo = Teclado.getUmString().toUpperCase();

                    try {
                        aeroportos.cadastreVoo(numeroVoo, codigoOrigem, codigoDestino);
                        System.out.println("\nVoo cadastrado com sucesso!");
                    } catch (Exception ex) {
                        System.err.println("\nErro ao cadastrar voo: " + ex.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o número do voo a ser removido:");
                    String vooRemover = Teclado.getUmString().toUpperCase();

                    try {
                        aeroportos.removaVoo(vooRemover);
                        System.out.println("\nVoo removido com sucesso!");
                    } catch (Exception ex) {
                        System.err.println("\nErro ao remover voo: " + ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("\nDigite o código do aeroporto para listar os voos:");
                    String codigoAeroportoListar = Teclado.getUmString().toUpperCase();

                    try {
                        aeroportos.listeVoos(codigoAeroportoListar);
                    } catch (Exception ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("\nO programa foi encerrado.");
                    break;
                default:
                    System.out.println("\nOpção inválida. Digite um número válido.");
                    break;
            }
        } while (opcao != 0);

    }
}
