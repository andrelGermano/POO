package dominio;

public abstract class A {
    private int atributoA;

    public A(){
       atributoA+=1;
    }

    public A(int A){
        atributoA=A;
    }

    public void setAtributoA(int atributoA){
        this.atributoA=atributoA;
    }

    public int getAtributoA(){
        return atributoA;
    }

    public abstract void somaDez();

    public abstract int retorna();
}
