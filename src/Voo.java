
public class Voo {
    private String numeroVoo;
    private Aeroporto destino;

    public Voo(String numeroVoo, Aeroporto destino) {
        this.numeroVoo = numeroVoo;
        this.destino = destino;
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

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "{ Número: " + this.numeroVoo + ", Código destino: " + this.destino.getNome() + " }";
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
