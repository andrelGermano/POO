package dominio;

public class C extends A implements I{
    private int c1;

    public C(){
        super(1);
        c1=3;
    }

    public void setC1(int c1){
        this.c1=c1;
    }

    public int getC1(){
        return c1;
    }

    public int retornaMais10(){
        return c1+10;
    }

    public String retornaClasse(){
        return "Classe C";
    }

    public int I1(){
        return 31;
    }

    public int I2(){
        return 32;
    }
}