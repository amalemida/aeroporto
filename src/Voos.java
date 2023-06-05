public class Voos {
    ListaSimplesOrdenada<Voo> listaVoos;

    public Voos() {
        listaVoos = new ListaSimplesOrdenada<Voo>();

    }

    public void adicioneVoo(Voo voo) throws Exception {
        listaVoos.guardeUmItemNoInicio(voo);
    }

    public void removaVoo(String numeroVoo) throws Exception {
        Voo voo = new Voo(numeroVoo);
        listaVoos.removaItemIndicado(voo);
    }

    public void listeVoos(String codigoAeroporto) throws Exception {
        Boolean achou = false;
        Voo voo = new Voo(codigoAeroporto);
        for (int i = 0; i < listaVoos.getQuantidade(); i++) {
            Aeroporto aeroporto = listaVoos.tem();
            if (aeroporto.getCodigo().equals(codigoAeroporto)) {
                System.out.println(aeroporto);
                achou = true;
                break;
            }
        }
        if (!achou) {
            throw new Exception("Aeroporto não encontrado!");
        }

    @Override
    public String toString() {
        return "Voos " + listaVoos;
    }

}
