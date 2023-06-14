
class Aeroporto {
    private String nome;
    private String codigo;
    private Voos voos;

    public Aeroporto() {}
    
    public Aeroporto(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.voos = new Voos();
    }

    public String getNome() {
        return nome;
    }

    public Voos getVoos() {
        return voos;
    }

    public void setVoos(Voos voos) {
        this.voos = voos;
    }

    public String getCodigo() {
        return codigo;
    }

    public Aeroporto cadastreAeroporto(String nome, String codigo) throws Exception {
        Aeroporto aeroporto = new Aeroporto(nome, codigo);
        Aeroportos aeroportos = new Aeroportos();
        for (int i = 0; i < aeroportos.getlistaDeAeroportos().getQuantidade(); i++) {
            if (aeroportos.getlistaDeAeroportos().getIezimo(i).getCodigo().equals(codigo)){
                throw new Exception("Aeroporto já cadastrado");
            }

        }
        return aeroporto;
    }

    public void adicioneVooNesseAeroporto(Voo voo) throws Exception {
        for (int i = 0; i < voos.getlistaDeVoos().getQuantidade(); i++) {
            if (voos.getlistaDeVoos().getIezimo(i).getOrigem().equals(codigo))
                throw new Exception("Voo já cadastrado");
        }

        this.voos.adicioneVooNaListaDeVoos(voo);
    }

    public void listeVoos(String codigoAeroporto) throws Exception {
        voos = new Voos();
        for (int i = 0; i < voos.getlistaDeVoos().getQuantidade(); i++) {
            if (voos.getlistaDeVoos().getIezimo(i).getOrigem().equals(codigoAeroporto))
                System.out.println(voos.getlistaDeVoos().getIezimo(i));
        }
    }
    

    @Override
    public String toString() {
        return "Aeroporto: " + nome + ", código = " + codigo + ", Voos = " + voos;
    }

}