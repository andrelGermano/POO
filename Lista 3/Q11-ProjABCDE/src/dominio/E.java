package dominio;

import java.util.ArrayList;

public class E {
    private static ArrayList<A> lista = new ArrayList<A>();

    public void add(A object){
        lista.add(object);
    }

    public static ArrayList<A> getArray(){
        return lista;
    }

    public static A retornar(int indice){
        return lista.get(indice);
    }
}
