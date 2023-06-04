class Aeroportos {
    private Aeroporto[] aeroportos;
    private int numeroAeroportos = 0;

    public Aeroportos(int numeroAeroportos) {
        this.aeroportos = new Aeroporto[numeroAeroportos];
    }

    void adicionarAeroporto(Aeroporto aeroporto) throws Exception {
        if (numeroAeroportos >= aeroportos.length) {
            throw new Exception("Número maáximo de voos atingido!");
        }

        aeroportos[numeroAeroportos] = aeroporto;
        numeroAeroportos++;
    }

    void cadastrarVoo(String numeroVoo, String codigoOrigem, String codigoDestino) throws Exception {
        Aeroporto origem = null;
        for (int i = 0; i < numeroAeroportos; i++) {
            if (aeroportos[i].getCodigo().equals(codigoOrigem)) {
                origem = aeroportos[i];
                break;
            }
        }

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

        Voo voo = new Voo(numeroVoo, destino);
        origem.adicionarVoo(voo);
    }

    void removerVoo(String numeroVoo) throws Exception {
        Voo voo = new Voo(numeroVoo);

        for (int i = 0; i <= this.numeroAeroportos; i++) {
            Aeroporto aeroporto = this.aeroportos[i];
            if (aeroporto.getVoos().tem(voo)) {
                aeroporto.getVoos().removaItemIndicado(voo);
            } else
                throw new Exception("Voo não encontrado!");

        }
    }

    void listarVoos(String codigoAeroporto) throws Exception {
        for (int i = 0; i < this.numeroAeroportos; i++) {
            Aeroporto aeroporto = this.aeroportos[i];
            if (aeroporto.getCodigo().equals(codigoAeroporto)) {
                System.out.println(aeroporto);
                break;
            } else {
                throw new Exception("Aeroporto não encontrado!");
            }
        }
    }

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < this.numeroAeroportos; i++) {
            ret += aeroportos[i] + "\n";
        }
        return ret;
    }
}
