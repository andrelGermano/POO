package aplicacao;

public class C2 extends C1{
    private int c2;

    public int c2(int c2){
        c2+=2;
        return c2;
    }

    public int c2(int c2a, int c2b){
        c2a+=1;
        c2b+=1;
        return c2a+c2b;
    }
}
