public class Voos {
    private ListaSimplesOrdenada<Voo> listaDeVoos;

    public Voos() {
        listaDeVoos = new ListaSimplesOrdenada<Voo>();
    }

    public ListaSimplesOrdenada<Voo> getlistaDeVoos() {
        return listaDeVoos;
    }

    public void setlistaDeVoos(ListaSimplesOrdenada<Voo> listaDeVoos) {
        this.listaDeVoos = listaDeVoos;
    }

    public void removaVoo(String numeroVoo) throws Exception {
        Voo voo = new Voo(numeroVoo);
        for( int i = 0; i < listaDeVoos.getQuantidade(); i++) {
            if(listaDeVoos.getIezimo(i).getNumeroVoo().equals(numeroVoo)) {
                listaDeVoos.removaItemIndicado(voo);
            }
        }
    }

    public void adicioneVooNaListaDeVoos(Voo voo) throws Exception {
        for( int i = 0; i < listaDeVoos.getQuantidade(); i++) {
            if(listaDeVoos.getIezimo(i).getNumeroVoo().equals(voo.getNumeroVoo())) {
                throw new Exception("Voo já existe");
            }
        }
        listaDeVoos.guardeUmItemNoInicio(voo);
    }
     
    @Override
    public String toString() {
        return "Voos " + listaDeVoos;
    }

}