public class Artista{
    private String nomeArtista;
    private int idadeArtista;
    
    //Construtor
    public Artista(String nomeArtista, int idadeArtista){
     this.nomeArtista = nomeArtista;
     this.idadeArtista = idadeArtista;
    }
    //get e set
    public String getNomeArtista(){
        return nomeArtista;
    }
    public void setNomeArtista(String nomeArtista){
        this.nomeArtista = nomeArtista;
    }
    public int getIdadeArtista(){
        return idadeArtista;
    }
    public void setIdadeArtista(int idadeArtista){
       this.idadeArtista = idadeArtista;
    }
    //método
    public void apresentarArtista(){
        System.out.println("Olá, meu nome é " + nomeArtista + "e tenho " + idadeArtista + "anos.");
    }
}
