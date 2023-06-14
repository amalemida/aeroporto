public class Aeroportos {
    private ListaSimplesOrdenada<Aeroporto> listaDeAeroportos; 

    public Aeroportos() {}
    
    public Aeroportos(ListaSimplesOrdenada<Aeroporto> listaDeAeroportos) {
        this.listaDeAeroportos = listaDeAeroportos;
    }

    public ListaSimplesOrdenada<Aeroporto> getlistaDeAeroportos() {
        return listaDeAeroportos;
    }

    public void setlistaDeAeroportos(ListaSimplesOrdenada<Aeroporto> listaDeAeroportos) {
        this.listaDeAeroportos = listaDeAeroportos;
    } 

    public void adicioneAeroporto(Aeroporto aeroporto) throws Exception {
        if (aeroporto == null)
            throw new Exception("Informacao ausente");
        this.listaDeAeroportos.guardeUmItemNoInicio(aeroporto);
    }

    public void removeAeroporto(Aeroporto  aeroporto) throws Exception {
        if (aeroporto == null)
            throw new Exception("Informacao ausente");
        this.listaDeAeroportos.removaItemIndicado(aeroporto);;
    }

    @Override
    public String toString() {
        return "listaDeAeroportos [" + listaDeAeroportos + "]";
    }

}
