package dominio;

public class C extends A implements I{
    private int atributoC;
    private char c1;

    public C(){
        c1=0;
        atributoC=0;
    }

    public void setC1(char c1){
        this.c1=c1;
    }

    public char getC1(){
        return c1;
    }

    public void somaDez() {
        atributoC+=11;
    }

    public int retorna() {
        return 1;
    }

    public void metodoUm(){
        atributoC=1;
    }
    public boolean metodoDois(){
        if(atributoC==1)
            return true;
        else
            return false;
    }
}
