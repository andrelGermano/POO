package dominio;

public class Item {
    private int id;
    private String titulo;
    private String dataAquisicao;

    public Item(int id, String titulo, String dataAquisicao) {
        this.id = id;
        this.titulo = titulo;
        this.dataAquisicao = dataAquisicao;
    }
}
