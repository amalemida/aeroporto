public class AeroportoApp {

    public static void main(String[] args) throws Exception {
        // Cadastramento dos aeroportos
        Aeroporto cnf = new Aeroporto("BELO HORIZONTE", "CNF");
        Aeroporto bsb = new Aeroporto("BRASÍLIA", "BSB");
        Aeroporto gig = new Aeroporto("RIO DE JANEIRO", "GIG");
        Aeroporto ssa = new Aeroporto("SALVADOR", "SSA");
        Aeroporto gru = new Aeroporto("SÃO PAULO", "GRU");

        
        ListaSimplesOrdenada<Aeroporto> listaAeroportos = new ListaSimplesOrdenada<Aeroporto>();
        
        Aeroportos aeroportos = new Aeroportos(listaAeroportos);
        
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

        voos.adicioneVooNaListaDeVoos(voo107);
        voos.adicioneVooNaListaDeVoos(voo214);
        voos.adicioneVooNaListaDeVoos(voo555);
        voos.adicioneVooNaListaDeVoos(voo101);
        voos.adicioneVooNaListaDeVoos(voo554);
        voos.adicioneVooNaListaDeVoos(voo090);
        voos.adicioneVooNaListaDeVoos(voo050);
        voos.adicioneVooNaListaDeVoos(voo089);
        voos.adicioneVooNaListaDeVoos(voo102);
        voos.adicioneVooNaListaDeVoos(voo215);

        cnf.adicioneVooNesseAeroporto(voo555);
        cnf.adicioneVooNesseAeroporto(voo101);
        cnf.adicioneVooNesseAeroporto(voo214);
        bsb.adicioneVooNesseAeroporto(voo107);
        gig.adicioneVooNesseAeroporto(voo554);
        gig.adicioneVooNesseAeroporto(voo090);
        gru.adicioneVooNesseAeroporto(voo089);
        gru.adicioneVooNesseAeroporto(voo050);        
        gru.adicioneVooNesseAeroporto(voo102);
        ssa.adicioneVooNesseAeroporto(voo215);

     //   System.out.println(voos);
     System.out.println(aeroportos);
       
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
                        Aeroporto adicionaVoo = new Aeroporto();
                        novoVoo.cadastreVoo(numeroVoo, codigoOrigem, codigoDestino);
                        voos.adicioneVooNaListaDeVoos(novoVoo);
                        adicionaVoo.adicioneVooNesseAeroporto(novoVoo);
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
                        Aeroporto aeroporto = new Aeroporto();
                        aeroporto.listeVoos(codigoAeroportoListar);
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
