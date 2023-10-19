package dominio;

public class B extends A{
    private int atributoB;
    private char b1;

    public B(){
        b1=0;
        atributoB=0;
    }

    public void setB1(char b1){
        this.b1=b1;
    }

    public char getB1(){
        return b1;
    }

    public void somaDez() {
        atributoB+=10;
    }

    public int retorna() {
        return 0;
    }
}
