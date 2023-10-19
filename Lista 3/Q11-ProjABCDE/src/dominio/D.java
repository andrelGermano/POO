package dominio;

public class D extends A implements I{
    private int d1;

    public D(){
        super(1);
        d1=4;
    }

    public void setD1(int d1){
        this.d1=d1;
    }

    public int getD1(){
        return d1;
    }

    public int retornaMais10(){
        return d1+10;
    }

    public String retornaClasse(){
        return "Classe D";
    }

    public int I1(){
        return 41;
    }

    public int I2(){
        return 42;
    }
}