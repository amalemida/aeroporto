
class Aeroportos {
    private Aeroporto[] aeroportos;
    private int numeroAeroportos = 0;

    public Aeroportos(int numeroAeroportos) {
        this.aeroportos = new Aeroporto[numeroAeroportos];
    }

    void adicionarAeroporto(Aeroporto aeroporto) throws Exception {
        // validar se cabem mais aeroportos
        // adicionar no vetor na posicao "numeroAeroportos"
        // incrementar numeroAeroportos   

        if (numeroAeroportos >= aeroportos.length) {
            throw new Exception("Número maáximo de voos atingido!");
        }

        aeroportos[numeroAeroportos] = aeroporto;
        numeroAeroportos++;        
    }    

    void cadastrarVoo(String numeroVoo, String codigoOrigem, String codigoDestino) throws Exception {
        // encontrar o aeroporto de origem na lista aeroportos
        Aeroporto origem = null;
        for (int i = 0; i < numeroAeroportos; i++) {
            if (aeroportos[i].getCodigo().equals(codigoOrigem)) {
                origem = aeroportos[i];
                break;
            }
        }
        
        // econtrar o indice do aeroporto de destino na lista aeroportos
        Aeroporto destino = null;
        for (int j = 0; j < numeroAeroportos; j++) {
            if (aeroportos[j].getCodigo().equals(codigoDestino)) {
                destino = aeroportos[j];
                break;
            }
        }

        if (origem == null || destino == null) {
            throw new Exception("Aeroportos não encontrados!");
        }

        // Criar um novo Voo
        Voo voo = new Voo(numeroVoo, destino);
        // adicionar o Voo na lista de Voos do aeroporto de origem
        origem.adicionarVoo(voo);
    }

    void removerVoo(String numeroVoo) throws Exception {
        // percorrar o vetor de aeroportos e para cada lista de voos (usar o getProx, termina quando for null) ver se o voo esta la
        // se o voo estiver la, pegar esse Voo (getInfo) e chama o metodo removerVoo da lista de voos do aeroporto passando esse Voo
        Voo voo = new Voo(numeroVoo);

        for (int i = 0; i <= this.numeroAeroportos; i++) {
            Aeroporto aeroporto = this.aeroportos[i];
            if(aeroporto.getVoos().tem(voo)){
                aeroporto.getVoos().removaItemIndicado(voo);
                break;
            }   
        }
    }

    void listarVoos(String codigoAeroporto) {
        // encontrar o aeroporto de origem na lista aeroportos
        // percorrer a lista de voos
        // recuperar o codigo do voo destino (vc tem o indice)
        // printar as informacoes do voo

        for (int i = 0; i < this.numeroAeroportos; i++) {
            Aeroporto aeroporto = this.aeroportos[i];
            if (aeroporto.getCodigo().equals(codigoAeroporto)) {
                System.out.println(aeroporto.toString());
            };
        }
    }
    
}
