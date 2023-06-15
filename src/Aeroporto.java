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

    public Aeroporto(String codigoAeroporto) {
		this.codigo = codigoAeroporto;
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
          System.out.println(voos.toString());
            
        }
    }
    
    public void adicionarVoo(Voo voo) throws Exception {

    	voos.adicionarVoo(voo);
    }

     public static Aeroporto cadastrarAeroporto(String nome, String codigo){
         return new Aeroporto(nome, codigo);
     }
    @Override
    public String toString() {
        return "\nAeroporto [nome= " + nome + ", codigo= " + codigo + ", voos= " + voos + "]";
    }

    
    
}
