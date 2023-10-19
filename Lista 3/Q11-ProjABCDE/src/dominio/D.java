package dominio;

public class D extends A implements I{
    private int atributoD;
    private char d1;

    public D(){
        d1=0;
        atributoD=0;
    }

    public void setB1(char d1){
        this.d1=d1;
    }

    public char getD1(){
        return d1;
    }

    public void somaDez() {
        atributoD+=12;
    }

    public int retorna() {
        return 2;
    }

    public void metodoUm(){
        atributoD=1;
    }

    public boolean metodoDois(){
        if(atributoD==1)
            return true;
        else
            return false;
    }
}
