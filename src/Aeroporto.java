
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

    // criar um metodo adicionar Voo
    public void adicionarVoo(Voo voo) throws Exception {
        voos.guardeUmItemNoInicio(voo);
    }

    @Override
    public String toString() {
        StringBuilder aeroporto = new StringBuilder();
        aeroporto.append("========================");
        aeroporto.append("\nNome: " + nome);
        aeroporto.append("\nCodigo: " + codigo);
        aeroporto.append("\nVoos: " + voos.toString());
        aeroporto.append("========================");
        return aeroporto.toString();
    }
}