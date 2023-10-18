package dominio;

public class Revista extends Livro{
    private int volume;

    public Revista(int id, String titulo, String dataAquisicao, String editora, int anoPublicacao, int volume){
        super(id, titulo, dataAquisicao, editora, anoPublicacao);
        this.volume=volume;
    }
}
