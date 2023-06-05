
public class Voo {
    private String numeroVoo;
    private String destino;
    private String origem;

    public Voo() {
    }

    public Voo(String numeroVoo, String destino, String origem) {
        this.numeroVoo = numeroVoo;
        this.destino = destino;
        this.origem = origem;
    }

    public Voo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getnumeroVoo() {
        return numeroVoo;
    }

    public void setnumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Voo cadastreVoo(String numeroVoo, String codigoOrigem, String codigoDestino) throws Exception {
        Voo voo = new Voo(numeroVoo, codigoDestino, codigoOrigem);

        return voo;
    }
    
    @Override
    public String toString() {
        String ret ="";
            ret += "\n{ Número: " + this.numeroVoo + ", Cidade origem: " + this.origem + ", Cidade destino: " + this.destino + " }\n";
        return ret;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroVoo == null) ? 0 : numeroVoo.hashCode());
        result = prime * result + ((destino == null) ? 0 : destino.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Voo other = (Voo) obj;
        if (numeroVoo == null) {
            if (other.numeroVoo != null)
                return false;
        } else if (!numeroVoo.equals(other.numeroVoo))
            return false;

        return true;
    }

}
