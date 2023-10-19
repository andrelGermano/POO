package dominio;

import java.util.ArrayList;

public class E{
    private static ArrayList<A> lClasses = new ArrayList<A>();

    public static ArrayList<A> retornaArray(){
        return lClasses;
    }

    public static A retornaElemento(int indice){
        return E.lClasses.get(indice);
    }

    public void add(A obj){
        lClasses.add(obj);
    }


}