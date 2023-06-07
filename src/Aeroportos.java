class Aeroportos {
    private Aeroporto[] aeroportos;
    private int numeroAeroportos = 0;
    ListaSimplesOrdenada<Aeroporto> listaDeAeroportos;
    
    public Aeroportos(int numeroAeroportos) {
        this.aeroportos = new Aeroporto[numeroAeroportos];
    }
    
    public Aeroporto[] getAeroportos() {
        return aeroportos;
    }

    public int getNumeroAeroportos() {
        return numeroAeroportos;
    }

    public void setNumeroAeroportos(int numeroAeroportos) {
        this.numeroAeroportos = numeroAeroportos;
    }

    public void adicioneAeroporto(Aeroporto aeroporto) throws Exception {
        if (numeroAeroportos >= aeroportos.length) {
            throw new Exception("Número maáximo de voos atingido!");
        }

        aeroportos[numeroAeroportos] = aeroporto;
        numeroAeroportos++;
    }

    public void listeVoos(String codigoAeroporto) throws Exception {
        boolean achou = false;
        Voo voo = new Voo();
        for (int i = 0; i < this.numeroAeroportos; i++) {
            Aeroporto aeroporto = this.aeroportos[i];
            if (aeroporto.getCodigo().equals(codigoAeroporto)) {
                aeroporto.getVoos().listeVoos(voo);
             //   System.out.println(aeroporto);
                achou = true;
                break;
            }
        }
        if (!achou) {
            throw new Exception("Aeroporto não encontrado!");
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
