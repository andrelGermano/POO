package visao;

import aplicacao.Voo;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int op, cod=0, dia, mes, ano, i, auxInt, codAux=0;
        boolean auxBool;

        Voo voo;
        ArrayList<Voo> listVoo = new ArrayList<Voo>();
        Scanner r = new Scanner(System.in);
        do {
            System.out.println("-------------------- MENU --------------------");
            System.out.println("1 - Cadastrar Vôo");
            System.out.println("2 - Consultar próxima cadeira livre");
            System.out.println("3 - Verificar disponibilidade de cadeira");
            System.out.println("4 - Ocupar cadeira");
            System.out.println("5 - Consultar quantidade de vagas disponíveis");
            System.out.println("6 - Buscar vôo");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");
            op=r.nextInt();
            System.out.println("----------------------------------------------");

            switch(op){
                case 1: System.out.println(" --- CADASTRAR VÔO --- ");
                    System.out.println("Data do vôo");
                    System.out.print("Dia: ");
                    dia=r.nextInt();
                    System.out.print("Mês: ");
                    mes=r.nextInt();
                    System.out.print("Ano: ");
                    ano=r.nextInt();
                    voo = new Voo(cod, dia, mes, ano);
                    listVoo.add(voo);
                    System.out.println("Cadastrado com sucesso! Código de vôo: " + cod);
                    cod++;
                break;
                case 2: System.out.println(" --- PRÓXIMA CADEIRA LIVRE --- ");
                    System.out.print("Código do vôo: ");
                    auxInt=r.nextInt();
                    auxBool=false;
                    for(i=0;i<listVoo.size();i++){
                        if(listVoo.get(i).getVoo()==auxInt){
                            auxBool=true;
                            codAux=i;
                            break;
                        }
                    }
                    if(auxBool){
                        System.out.println("A próxima cadeira livre deste vôo é " + listVoo.get(codAux).proximoLivre());
                    }else{
                        System.out.println("Nenhum vôo com esse código foi encontrado.");
                    }
                break;
                case 3: System.out.println(" --- VERIFICAR DISPONIBILIDADE DE CADEIRA --- ");
                    System.out.print("Código do vôo: ");
                    auxInt=r.nextInt();
                    auxBool=false;
                    for(i=0;i<listVoo.size();i++){
                        if(listVoo.get(i).getVoo()==auxInt){
                            auxBool=true;
                            codAux=i;
                            break;
                        }
                    }
                    if(auxBool){
                        System.out.print("Digite a cadeira que deseja verificar: ");
                        auxInt=r.nextInt();
                        if(listVoo.get(codAux).verifica(auxInt))
                            System.out.println("A cadeira "+ auxInt +" está ocupada.");
                        else
                            System.out.println("A cadeira "+ auxInt +" está  disponível.");
                    }else{
                        System.out.println("Nenhum vôo com esse código foi encontrado.");
                    }
                break;
                case 4: System.out.println(" --- OCUPAR CADEIRA --- ");
                    System.out.print("Código do vôo: ");
                    auxInt=r.nextInt();
                    auxBool=false;
                    for(i=0;i<listVoo.size();i++){
                        if(listVoo.get(i).getVoo()==auxInt){
                            auxBool=true;
                            codAux=i;
                            break;
                        }
                    }
                    if(auxBool){
                        do {
                            System.out.print("Cadeira que deseja ocupar: ");
                            auxInt = r.nextInt();
                        }while(auxInt<1||auxInt>100);
                        if(listVoo.get(codAux).ocupa(auxInt))
                            System.out.println("Concluído!");
                        else
                            System.out.println("A cadeira está ocupada.");
                    }else{
                        System.out.println("Nenhum vôo com esse código foi encontrado.");
                    }
                break;
                case 5: System.out.println(" --- CONSULTAR QUANTIDADE DE VAGAS DISPONÍVEIS --- ");
                    System.out.print("Código do vôo: ");
                    auxInt=r.nextInt();
                    auxBool=false;
                    for(i=0;i<listVoo.size();i++){
                        if(listVoo.get(i).getVoo()==auxInt){
                            auxBool=true;
                            codAux=i;
                            break;
                        }
                    }
                    if(auxBool){
                        System.out.println(listVoo.get(codAux).vagas() + " vagas estão disponíveis no momento.");
                    }else{
                        System.out.println("Nenhum vôo com esse código foi encontrado.");
                    }
                    break;
                case 6: System.out.println(" --- BUSCAR VÔO --- ");
                    System.out.print("Código do vôo: ");
                    auxInt=r.nextInt();
                    auxBool=false;
                    for(i=0;i<listVoo.size();i++){
                        if(listVoo.get(i).getVoo()==auxInt){
                            auxBool=true;
                            codAux=i;
                            break;
                        }
                    }
                    if(auxBool){
                        System.out.println("Código do vôo: " + listVoo.get(codAux).getVoo());
                        System.out.println("Data do vôo: " + listVoo.get(codAux).getDia() + " de " + listVoo.get(codAux).getMesExtenso() + " de " + listVoo.get(codAux).getAno());
                    }else{
                        System.out.println("Nenhum vôo com esse código foi encontrado.");
                    }
                    break;
                case 7: System.out.println(" --- SAIR ---");
                    break;
                default: System.out.println("Código inválido");
            }
        }while(op!=7);

    }


}
