public class Aeroportos {
    private ListaSimplesOrdenada<Aeroporto> listaDeAeroportos;

    public Aeroportos() {
        this.listaDeAeroportos = new ListaSimplesOrdenada<>();
    }

    public void adicionarAeroporto(Aeroporto aeroporto) throws Exception {
        listaDeAeroportos.guardeUmItemNoFinal(aeroporto);
    }

    public void removerAeroporto(Aeroporto aeroporto) throws Exception {
        listaDeAeroportos.removaItemIndicado(aeroporto);
    }

    public ListaSimplesOrdenada<Aeroporto> getListaDeAeroportos() {
        return listaDeAeroportos;
    }

    @Override
    public String toString() {
        return "Aeroportos [" + listaDeAeroportos + "]";
    }

    
}
