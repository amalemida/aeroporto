
class Aeroporto {
    private String nome;
    private String codigo;
    private Lista<Voo> voos;

    public Aeroporto(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.voos = new Lista<Voo>();
    }

    public String getNome() {
        return nome;
    }

    public Lista<Voo> getVoos() {
        return voos;
    }

    public void setVoos(Lista<Voo> voos) {
        this.voos = voos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void adicionarVoo(Voo voo) throws Exception {
        voos.guardeUmItemNoInicio(voo);
    }

    @Override
    public String toString() {
        return "Aeroporto: " + nome + ", código = " + codigo + ", Voos = " + voos;
    }

}