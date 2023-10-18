package dominio;

public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public Porta(double dx, double dy, double dz, String cor){
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
        this.cor=cor;
    }

    public String getCor() {
        return cor;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void abre(){
        aberta=true;
    }

    public void fecha(){
        aberta=false;
    }

    public void pinta(String s){
        cor=s;
    }

    public boolean estaAberta(){
        boolean estaABerta=false;
        if(aberta)
            return true;
        else
            return false;
    }
}
