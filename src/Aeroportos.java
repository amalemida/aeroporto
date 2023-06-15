public class Aeroportos {
    private ListaSimplesOrdenada<Aeroporto> listaDeAeroportos;

    public Aeroportos() {
        this.listaDeAeroportos = new ListaSimplesOrdenada<Aeroporto>();
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

     //criar método que lista os voos de um determinado aeroporto

    public void listarVoos(String codigoAeroportoListar) throws Exception {
        for (int i = 0; i < listaDeAeroportos.getQuantidade(); i++) {
            Aeroporto aeroporto = listaDeAeroportos.getIezimo(i);
            if (listaDeAeroportos.getIezimo(i).getCodigo().equals(codigoAeroportoListar)) {
                System.out.println(aeroporto);
            }
        }
    }

    @Override
    public String toString() {
        return "\nAeroportos [" + listaDeAeroportos + "]";
    }

    
}
