package dominio;

public class B extends A{
    private int b1;

    public B(){
        super(1);
        b1 = 2;
    }

    public void setB1(int b1){
        this.b1=b1;
    }

    public int getB1(){
        return b1;
    }

    public int retornaMais10(){
        return b1+10;
    }

    public String retornaClasse(){
        return "Classe B";
    }
}