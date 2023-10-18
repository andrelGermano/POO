package dominio;

public abstract class Imovel {
    private String cor;

    public void pinta(String s){
        cor=s;
    }

    public String getCor() {
        return cor;
    }

    public abstract int quantasPortasEstaoAbertas();
}