package visao;

import dominio.Casa;
import dominio.Edificio;
import dominio.Porta;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int resp;
        Scanner r = new Scanner(System.in);

        /*Criando porta e testando seus métodos
        Porta p1 = new Porta();
        p1.abre();
        p1.fecha();

        System.out.println("----- Cor da porta -----");
        do{
            System.out.print("Digite a cor: ");
            p1.pinta(r.nextLine());
            System.out.print("Mudar novamente? 1 - Sim / 0 - Não: ");
            resp=r.nextInt();
            r.nextLine();
        }while(resp!=0);
        System.out.println("Cor final: " + p1.getCor());

        System.out.println("----- Dimensões da porta -----");
        System.out.print("Diemnsão X: ");
        p1.setDimensaoX(r.nextDouble());
        System.out.print("Diemnsão Y: ");
        p1.setDimensaoY(r.nextDouble());
        System.out.print("Diemnsão Z: ");
        p1.setDimensaoZ(r.nextDouble());

        System.out.println("----- Porta aberta ou fechada? -----");
        if(p1.estaAberta())
            System.out.println("Está aberta.");
        else
            System.out.println("Está fechada.");*/

        /*Criando casa e testando seus métodos
        Casa c1 = new Casa();

        System.out.println("----- Cor da casa -----");
        do{
            System.out.print("Digite a cor: ");
            c1.pinta(r.nextLine());
            System.out.print("Mudar novamente? 1 - Sim / 0 - Não: ");
            resp=r.nextInt();
            r.nextLine();
        }while(resp!=0);
        System.out.println("Cor final: " + c1.getCor());

        Porta p1 = new Porta(240, 1, 0.8, "marrom");
        Porta p2 = new Porta(240, 1, 0.8, "marrom");
        Porta p3 = new Porta(240, 1, 0.8, "marrom");

        p1.abre();
        p2.abre();
        p3.abre();
        p2.fecha();

        System.out.println("----- Quantas portas abertas? -----\n");
        System.out.println(c1.quantasPortasEstaoAbertas());*/

        //Criando edificio e testando seus métodos
        Edificio e1 = new Edificio();

        System.out.println("----- Cor da porta -----");
        do{
            System.out.print("Digite a cor: ");
            e1.pinta(r.nextLine());
            System.out.print("Mudar novamente? 1 - Sim / 0 - Não: ");
            resp=r.nextInt();
            r.nextLine();
        }while(resp!=0);
        System.out.println("Cor final: " + e1.getCor());

        System.out.println("----- Definir portas -----");
        System.out.print("Quantas portas? ");
        e1.setTotalDePortas(r.nextInt());
        Porta p2 = new Porta(1, 1, 1, "Marrom");
        e1.adicionaPorta(p2);
        e1.abrirPorta(0);
        e1.fecharPorta(1);
        e1.abrirPorta(2);
        e1.fecharPorta(3);
        e1.abrirPorta(4);
        e1.abrirPorta(5);
        System.out.println("Quantas portas abertas: " + e1.quantasPortasEstaoAbertas());
        System.out.println("Quantas portas fechadas: " + (e1.totalDePortas()-e1.quantasPortasEstaoAbertas()));

        System.out.println("----- Definir andares -----");
        System.out.print("Quantos andares você quer? ");
        int cont=r.nextInt();
        for(int i=0; i<cont;i++){
            e1.adicionarAndar();
        }
        System.out.println("Foram definidos " + e1.totalDeAndares() + " andares.");
    }
}
