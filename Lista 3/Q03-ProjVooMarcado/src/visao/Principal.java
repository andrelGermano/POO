package visao;

import aplicacao.VooMarcado;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int op, cod=0, dia, mes, ano, lugares, ocupar, i, auxInt, codAux=0;
        boolean auxBool;

        VooMarcado voo;
        ArrayList<VooMarcado> listVoo = new ArrayList<VooMarcado>();
        Scanner r = new Scanner(System.in);
        do {
            System.out.println("-------------------- MENU --------------------");
            System.out.println("1 - Cadastrar Vôo");
            System.out.println("2 - Consultar próxima cadeira livre");
            System.out.println("3 - Verificar disponibilidade de cadeira");
            System.out.println("4 - Ocupar cadeira");
            System.out.println("5 - Consultar quantidade de vagas disponíveis");
            System.out.println("6 - Buscar vôo");
            System.out.println("7 - Consultar tipo de assento");
            System.out.println("8 - Sair");
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
                    System.out.print("Capacidade máxima do vôo: ");
                    lugares=r.nextInt();
                    System.out.print("Quantas cadeiras são destinadas a fumantes? ");
                    auxInt=r.nextInt();
                    voo = new VooMarcado(cod, dia, mes, ano, lugares, auxInt);
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
                        System.out.println("A próxima cadeira livre deste vôo é " + (listVoo.get(codAux).proximoLivre()+1));
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
                        if(listVoo.get(codAux).verifica(auxInt-1))
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
                            auxInt = r.nextInt()-1;
                        }while(auxInt<0||auxInt>listVoo.get(codAux).getQtdCadeiras());
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
                        System.out.println("Quantidade de assentos: " + listVoo.get(codAux).getQtdCadeiras());
                        System.out.println("Quantidade de assentos destinados a fumantes: " + listVoo.get(codAux).getQtdFumantes());
                    }else{
                        System.out.println("Nenhum vôo com esse código foi encontrado.");
                    }
                    break;
                case 7: System.out.println(" --- CONSULTAR TIPO DE ASSENTO ---");
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
                        System.out.print("Qual a cadeira que deseja consultar?");
                        ocupar=r.nextInt();
                        if(listVoo.get(codAux).tipo(ocupar)=='F'){
                            System.out.println("É para fumantes");
                        }else{
                            System.out.println("É para não-fumantes");
                        }
                    }else{
                        System.out.println("Nenhum vôo com esse código foi encontrado.");
                    }
                    break;
                case 8: System.out.println(" --- SAIR ---");
                    break;
                default: System.out.println("Código inválido");
            }
        }while(op!=8);

    }


}