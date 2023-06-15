public class Voo {
    private String numeroVoo;
    private String origem;
    private String destino;

    public Voo(String numeroVoo, String origem, String destino) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
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

	@Override
	public String toString() {
		return "\nVoo [número do Voo = " + numeroVoo + ", origem = " + origem + ", destino = " + destino + "]";
	}

}