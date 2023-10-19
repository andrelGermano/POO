package visao;

import dominio.B;
import dominio.C;
import dominio.D;
import dominio.E;

public class Principal {
    public static void main(String[] args){
        System.out.println("Criando objetos das classes B, C e D");
        B b1 = new B();
        C c1 = new C();
        D d1 = new D();
        B b2 = new B();
        C c2 = new C();
        D d2 = new D();
        System.out.println("Criando objeto da classe E");
        E e1 = new E();
        System.out.println("Adicionando na lista");
        e1.add(b1);
        e1.add(c1);
        e1.add(d1);
        e1.add(b2);
        e1.add(c2);
        e1.add(d2);
        System.out.println("Testando metodos");
        for(int i=0; i<E.getArray().size();i++){
            if(E.getArray().get(i) instanceof B){
                B b = (B) E.getArray().get(i);
                b.setB1('B');
                System.out.println(b.getB1());
                System.out.println(b.retorna());
                b.somaDez();
            }else if(E.getArray().get(i) instanceof C){
                C c = (C) E.getArray().get(i);
                c.setC1('C');
                System.out.println(c.getC1());
                System.out.println(c.retorna());
                c.somaDez();
                c.metodoUm();
                if(c.metodoDois())
                    System.out.println("Está como 1");
                else
                    System.out.println("Não está como 1");
            }else if(E.getArray().get(i) instanceof D){
                D d = (D) E.getArray().get(i);
                d.setB1('D');
                System.out.println(d.getD1());
                System.out.println(d.retorna());
                d.somaDez();
                d.metodoUm();
                if(d.metodoDois())
                    System.out.println("Está como 1");
                else
                    System.out.println("Não está como 1");
            }
        }
    }
}
