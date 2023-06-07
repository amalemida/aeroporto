public class Voos {
    ListaSimplesOrdenada<Voo> listaVoos;

    public Voos() {
        listaVoos = new ListaSimplesOrdenada<Voo>();
        
    }
    
    public ListaSimplesOrdenada<Voo> getListaVoos() {
        return listaVoos;
    }

    public void setListaVoos(ListaSimplesOrdenada<Voo> listaVoos) {
        this.listaVoos = listaVoos;
    }
    
    public void adicioneVoo(Voo voo) throws Exception {
        listaVoos.guardeUmItemNoInicio(voo);
    }

    public void removaVoo(String numeroVoo) throws Exception {
        Voo voo = new Voo(numeroVoo);
        listaVoos.removaItemIndicado(voo);
    }

    public void listeVoos(Voo voo) throws Exception {
        for (int i = 0; i < this.listaVoos.getQuantidade(); i++) {
        
            if( this.listaVoos.tem(voo) ) {
                System.out.println(this.listaVoos);
            
            }
        }
    }
    
    @Override
    public String toString() {
        return "Voos " + listaVoos;
    }




}
