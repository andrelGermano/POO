package dominio;

public abstract class A{
    private int atA;

    public A(int atA){
        this.atA=atA;
    }

    public String A(){
        return "A foi criado";
    }

    public void setAtA(int atA){
        this.atA=atA;
    }

    public int getAtA(){
        return atA;
    }

    public abstract int retornaMais10();

    public abstract String retornaClasse();
}
/*Declare a classe Principal contendo objetos das classes B, C e D;
• Insira estes objetos no ArrayList da classe E;
• Teste todos os métodos, inclusive os da interface I e os da classe E. */