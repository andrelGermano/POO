package dominio;

public class DVD extends Item{
    private char tipo;

    public DVD(int id, String titulo, String dataAquisicao, char tipo){
        super(id, titulo, dataAquisicao);
        this.tipo=tipo;
    }
}
