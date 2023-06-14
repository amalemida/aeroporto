public class Voo {
    private String numeroVoo;
    private String destino;
    private String origem;

    public Voo(String numeroVoo, String destino, String origem) {
        this.numeroVoo = numeroVoo;
        this.destino = destino;
        this.origem = origem;
    }

    public Voo(String vooARemover) {
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigem() {
        return origem;
    }

}