public class Musica extends Midia{
    private String tipo;
    private int anoLancamento;
    
    //Construtor
    public Musica(String titulo, int duracao, String tipo, int anoLancamento){
        super(titulo, duracao);
        this.tipo = tipo;
        this.anoLancamento = anoLancamento;
    }
    //get e set
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public int getAnoLancamento(){
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    //polimorfismo
    @Override
    public void exibirinformacao(){
        System.out.println("Título: " + getTitulo() + "| Duração: " + getDuracao() + "min: | Tipo: " + tipo);
    }


    

}