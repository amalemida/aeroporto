
class Aeroporto {
    private String nome;
    private String codigo;
    private ListaSimplesOrdenada<Voo> voos;

    public Aeroporto() {
    }

    public Aeroporto(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.voos = new ListaSimplesOrdenada<Voo>();
    }

    public String getNome() {
        return nome;
    }

    public ListaSimplesOrdenada<Voo> getVoos() {
        return voos;
    }

    public void setVoos(ListaSimplesOrdenada<Voo> voos) {
        this.voos = voos;
    }

    public String getCodigo() {
        return codigo;
    }

    public Aeroporto cadastreAeroporto(String nome, String codigo) throws Exception {
        Aeroporto aeroporto = new Aeroporto(nome, codigo);
        return aeroporto;
    }

    public void adicioneVoo(Voo voo) throws Exception {
        voos.guardeUmItemNoInicio(voo);
    }

    @Override
    public String toString() {
        return "Aeroporto: " + nome + ", código = " + codigo + ", Voos = " + voos;
    }

}