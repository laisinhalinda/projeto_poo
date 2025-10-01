public class Midia {
    private String titulo;
    private int duracao;

    //Construtor 
    public Midia(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    //get e set
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getDuracao(){
        return duracao;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
     
    //método próprio
    public void reproduzir(){
        System.out.println("Reproduzindo: " + titulo);
    }
    public void exibirinformacao(){
        System.out.println("Titulo: " + titulo + "Duração: " + duracao + "min");
    }
    
    

    

}
