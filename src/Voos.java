public class Voos {
    private ListaSimplesOrdenada<Voo> listaDeVoos;

    public Voos() {
        this.listaDeVoos = new ListaSimplesOrdenada<Voo>();
    }

    public void adicionarVoo(Voo voo) throws Exception {
        listaDeVoos.guardeUmItemNoFinal(voo);
    }

    public void removerVoo(String vooARemover) throws Exception {
        Voo voo = new Voo(vooARemover);
        for (int i = 0; i < listaDeVoos.getQuantidade(); i++) {
            if (listaDeVoos.getIezimo(i).getNumeroVoo().equals(vooARemover)) {
                listaDeVoos.removaItemIndicado(voo);
                return;
            }
        }
    }

    public ListaSimplesOrdenada<Voo> getListaDeVoos() {
        return listaDeVoos;
    }

    @Override
    public String toString() {
        return "Voos [" + listaDeVoos + "]";
    }

}
