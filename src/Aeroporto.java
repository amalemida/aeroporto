
class Aeroporto {
    private String nome;
    private String codigo;
    private Voos voos;

    public Aeroporto() {
    }

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
        return aeroporto;
    }

    @Override
    public String toString() {
        return "Aeroporto: " + nome + ", código = " + codigo + ", Voos = " + voos.listaVoos;
    }

}