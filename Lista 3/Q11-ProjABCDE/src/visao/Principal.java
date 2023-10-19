package visao;

import dominio.B;
import dominio.C;
import dominio.D;
import dominio.E;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        int resp=0, i;
        char aux;

        Scanner r = new Scanner(System.in);

        System.out.println("Cadastrando classes");
        B b1 = new B(), b2 = new B(), b3 = new B();
        C c1 = new C(), c2 = new C(), c3 = new C();
        D d1 = new D(), d2 = new D(), d3 = new D();
        E e = new E();
        System.out.println("Cadastrado.");

        System.out.println("Adicionando na lista");
        e.add(b1); e.add(c1); e.add(d1);
        e.add(b2); e.add(c2); e.add(d2);
        e.add(b3); e.add(c3); e.add(d3);
        System.out.println("Adicionado.");

        do{
            System.out.println("1 - Escolher classe para mostrar métodos");
            System.out.println("2 - Mostrar todas as classes e seus métodos");
            System.out.print("Sua opção: ");
            resp=r.nextInt();
            r.nextLine();
            switch(resp){
                case 1:
                    System.out.print("Classe: ");
                    aux=r.nextLine().charAt(0);
                    if(aux=='C'){
                        for(i=0; i<E.retornaArray().size(); i++){
                            if(E.retornaArray().get(i) instanceof C){
                                C c = (C) E.retornaArray().get(i);
                                System.out.println(c.getC1());
                                System.out.println(c.retornaMais10());
                                System.out.println(c.retornaClasse());
                                System.out.println(c.I1());
                                System.out.println(c.I2());
                            }
                        }
                    }else if(aux=='B'){
                        for(i=0;i<E.retornaArray().size();i++){
                            if(E.retornaArray().get(i) instanceof B){
                                B b = (B) E.retornaArray().get(i);
                                System.out.println(b.getB1());
                                System.out.println(b.retornaMais10());
                                System.out.println(b.retornaClasse());
                            }
                        }
                    }else if(aux=='D'){
                        for(i=0;i<E.retornaArray().size(); i++){
                            if(E.retornaArray().get(i) instanceof D){
                                D d = (D) E.retornaArray().get(i);
                                System.out.println(d.getD1());
                                System.out.println(d.retornaClasse());
                                System.out.println(d.retornaMais10());
                                System.out.println(d.I1());
                                System.out.println(d.I2());
                            }
                        }
                    }else
                        System.out.println("Não há  essa classe");
                    break;
                case 2:
                    for(i=0; i<E.retornaArray().size(); i++){
                        if(E.retornaArray().get(i) instanceof C){
                            C c = (C) E.retornaArray().get(i);
                            System.out.println(c.getC1());
                            System.out.println(c.retornaMais10());
                            System.out.println(c.retornaClasse());
                            System.out.println(c.I1());
                            System.out.println(c.I2());
                        }else if(E.retornaArray().get(i) instanceof D){
                            D d = (D) E.retornaArray().get(i);
                            System.out.println(d.getD1());
                            System.out.println(d.retornaClasse());
                            System.out.println(d.retornaMais10());
                            System.out.println(d.I1());
                            System.out.println(d.I2());
                        }else if(E.retornaArray().get(i) instanceof B){
                            B b = (B) E.retornaArray().get(i);
                            System.out.println(b.getB1());
                            System.out.println(b.retornaMais10());
                            System.out.println(b.retornaClasse());
                        }
                    }
                    break;
                default:
                    System.out.println("Não tem essa opção");
            }
        }while(resp!=4);
    }
}