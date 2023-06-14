public class Aeroporto {
    private String nome;
    private String codigo;
    private Voos voos;

    public Aeroporto(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.voos = new Voos();
    }

    public Aeroporto() {
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Voos getVoos() {
        return voos;
    }

    public void listarVoos(String codigo) {
        if (this.codigo.equals(codigo)) {
            this.voos.getListaDeVoos();
        }
        System.out.println("\nVoos do aeroporto " + this.nome + ":");
    }

    @Override
    public String toString() {
        return "Aeroporto [nome= " + nome + ", codigo= " + codigo + ", voos= " + voos + "]";
    }

    
    
}
