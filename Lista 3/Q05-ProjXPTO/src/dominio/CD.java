package dominio;

public class CD extends Item{
    private String genero;

    public CD(int id, String titulo, String dataAquisicao, String genero){
        super(id, titulo, dataAquisicao);
        this.genero=genero;
    }
}
