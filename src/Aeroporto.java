
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

    // public void adicioneVooNaListaDoAeroporto(Voo voo) throws Exception {
    //     voos.adicioneVoo(voo);
    // }

    
    // public void removaVooDaListaDoAeroporto(String numeroVoo) throws Exception {
    //     Boolean achou = false;
    //     Voo voo = new Voo(numeroVoo);
    //     Aeroportos aeroportos = new Aeroportos(10);
        
    //     for (int i = 0; i < aeroportos.getNumeroAeroportos() ; i++) {
    //        Aeroporto aeroporto = aeroportos.getAeroportos()[i];
    //         if( aeroporto.getVoos().listaVoos.tem(voo)) {
    //             aeroporto.getVoos().listaVoos.removaItemIndicado(voo);
    //             achou = true;
    //             break;
            
    //         } 
              
    //     }
    //     if (!achou) {
    //         throw new Exception("Voo não encontrado!");
    //     }
    // }

    //     for (int i = 0; i < this.numeroAeroportos; i++) {
    //         Aeroporto aeroporto = this.aeroportos[i];
    //         if (aeroporto.getVoos().tem(voo)) {
    //             aeroporto.getVoos().removaItemIndicado(voo);
    //             achou = true;
    //             break;
    //         }
    //     }
    //     if (!achou) {
    //         throw new Exception("Voo não encontrado!");
    //     }
    // }

    @Override
    public String toString() {
        return "Aeroporto: " + nome + ", código = " + codigo + ", Voos = " + voos.listaVoos;
    }

}