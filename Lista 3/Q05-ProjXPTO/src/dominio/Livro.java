package dominio;

public class Livro extends Item{
    private String editora;
    private int anoPublicacao;

    public Livro(int id, String titulo, String dataAquisicao, String editora, int anoPublicacao){
        super(id, titulo, dataAquisicao);
        this.editora=editora;
        this.anoPublicacao=anoPublicacao;
    }
}
