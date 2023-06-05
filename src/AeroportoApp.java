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

        Voo voo107 = new Voo("107", "BSB", "SSA");
        Voo voo214 = new Voo("214", "CNF", "SSA");
        Voo voo555 = new Voo("555", "CNF", "GIG");
        Voo voo101 = new Voo("101", "CNF", "GRU");
        Voo voo554 = new Voo("554", "GIG", "CNF");
        Voo voo090 = new Voo("090", "GIG", "GRU");
        Voo voo050 = new Voo("050", "GRU", "BSB");
        Voo voo089 = new Voo("089", "GRU", "GIG");
        Voo voo102 = new Voo("102", "GRU", "CNF");
        Voo voo215 = new Voo("215", "SSA", "CNF");
        
        Voos voos = new Voos();

        voos.adicioneVoo(voo107);
        voos.adicioneVoo(voo214);
        voos.adicioneVoo(voo555);
        voos.adicioneVoo(voo101);
        voos.adicioneVoo(voo554);
        voos.adicioneVoo(voo090);
        voos.adicioneVoo(voo050);
        voos.adicioneVoo(voo089);
        voos.adicioneVoo(voo102);
        voos.adicioneVoo(voo215);

        System.out.println(voos);
        // cnf.adicioneVoo(voo555);
        // cnf.adicioneVoo(voo214);
        // cnf.adicioneVoo(voo101);
        // bsb.adicioneVoo(voo107);
        // gig.adicioneVoo(voo554);
        // gig.adicioneVoo(voo090);
        // gru.adicioneVoo(voo050);
        // gru.adicioneVoo(voo089);
        // gru.adicioneVoo(voo102);
        // ssa.adicioneVoo(voo215);

        // aeroportos.cadastreVoo("107", "BSB", "SSA");
        // aeroportos.cadastreVoo("214", "CNF", "SSA");
        // aeroportos.cadastreVoo("555", "CNF", "GIG");
        // aeroportos.cadastreVoo("101", "CNF", "GRU");
        // aeroportos.cadastreVoo("554", "GIG", "CNF");
        // aeroportos.cadastreVoo("090", "GIG", "GRU");
        // aeroportos.cadastreVoo("050", "GRU", "BSB");
        // aeroportos.cadastreVoo("089", "GRU", "GIG");
        // aeroportos.cadastreVoo("102", "GRU", "CNF");
        // aeroportos.cadastreVoo("215", "SSA", "CNF");

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
                        Voo novoVoo = new Voo();
                        Aeroporto adiconaVoo = new Aeroporto();
                        novoVoo.cadastreVoo(numeroVoo, codigoOrigem, codigoDestino);
                        voos.adicioneVoo(novoVoo);
                        System.out.println("\nVoo cadastrado com sucesso!");
                    } catch (Exception ex) {
                        System.err.println("\nErro ao cadastrar voo: " + ex.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o número do voo a ser removido:");
                    String vooARemover = Teclado.getUmString().toUpperCase();

                    try {
                     //   Aeroporto removeVoo = new Aeroporto();
                        voos.removaVoo(vooARemover);
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
