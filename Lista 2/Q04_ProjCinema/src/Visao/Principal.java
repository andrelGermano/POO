package Visao;

import java.util.Scanner;
import Aplicacao.ingresso;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		int op, cod=0, i, aux, resp, resp2;
		String resp3;
		boolean flag;
		ArrayList<ingresso> SALA = new ArrayList<ingresso>();
		Scanner r = new Scanner(System.in);
		boolean[] poltronaDisp = new boolean[120];
		for(i=0;i<120;i++) {
			poltronaDisp[i]=true;
		}
		
		do {
			System.out.println("--------- MENU ---------");
			System.out.println("1 - Comprar ingresso"    );
			System.out.println("2 - Alterar ingresso"    );
			System.out.println("3 - Desistir de ingresso");
			System.out.println("4 - Sair"                );
			System.out.println("------------------------");
			System.out.println("Opção: ");
			op=r.nextInt();
			
			
			switch(op) {
				case 1: System.err.println("------ COMPRAR INGRESSO ------");
					ingresso a = new ingresso();
					a.setId(cod);
					System.out.println("Digite seu CPF: ");
					r.nextLine();
					a.setCpfCliente(r.nextLine());
					System.out.println("Nome do filme: ");
					a.setFilme(r.nextLine());
					System.out.println("Qual o tipo do ingresso? (1 - Inteira / 2 - Meia): ");
					a.setValorIngresso(r.nextInt());
					System.out.println("Poltronas disponíveis: ");
					for(i=0;i<120;i++) {
						if(poltronaDisp[i]==true)
							System.out.println((i+1) + ", ");
					}
					do {
						System.out.println("Sua poltrona: ");
						aux=r.nextInt()-1;
						
						if(poltronaDisp[aux]==false)
							System.out.println("Esta poltrona já foi escolhida. Por favor, escolha outra.");
					}while(poltronaDisp[aux]==false);
					poltronaDisp[aux]=false;
					a.setPoltrona(aux);
					SALA.add(a);
					System.out.println("Atenção! O código do seu ingresso é " + cod);
					cod++;
				break;
				
				case 2: System.out.println("ALTERAR INGRESSO");
					System.out.println("Digite o código do ingresso que deseja alterar: ");
					aux=r.nextInt();
					flag=false;
					for(i=0;i<SALA.size();i++) {
						if(SALA.get(i).getId()==aux)
							flag=true;
					}
					if(!flag)
						System.out.println("Não há ingresso disponível com esse código.");
					if(flag) {
						System.out.println("Dados do ingresso");
						System.out.println("CPF cadastrado: " + SALA.get(aux).getCpfCliente());
						System.out.println("Nome do filme: " + SALA.get(aux).getFilme());
						System.out.println("Tipo do ingresso: " + SALA.get(aux).verificarTipoIngresso(SALA.get(aux).getValorIngresso()));
						System.out.println("Valor do ingresso: " + SALA.get(aux).getValorIngresso());
						System.out.println("Poltrona: " + (SALA.get(aux).getPoltrona()+1));
						do {
							System.out.println("1 - Alterar CPF / 2 - Alterar nome do filme / 3 - Alterar tipo do ingresso / 4 - Alterar poltrona / 5 - Sair");
							resp=r.nextInt();
							switch(resp) {
							 	case 1: 
							 		r.nextLine();
							 		System.out.println("Digite o novo CPF: ");
							 		resp3 = r.nextLine();
							 		System.out.println("Confirma? 1 - Sim / 2 - Não");
							 		if(r.nextInt()==1)
							 			SALA.get(aux).setCpfCliente(resp3);
								break;
							 	case 2:
							 		r.nextLine();
							 		System.out.println("Digite o novo nome do filme: ");
							 		resp3 = r.nextLine();
							 		System.out.println("Confirma? 1 - Sim / 2 - Não");
							 		if(r.nextInt()==1)
							 			SALA.get(aux).setFilme(resp3);
							 	break;
							 	case 3:
							 		System.out.println("Digite pra qual tipo deseja alterar. (1 - Inteira / 2 - Meia)");
							 		resp2=r.nextInt();
							 		System.out.println("Confirma? 1 - Sim / 2 - Não");
							 		if(r.nextInt()==1)
							 			SALA.get(aux).setValorIngresso(resp2);
							 	break;
							 	case 4:
							 		System.out.println("Poltronas disponíveis: ");
									for(i=0;i<120;i++) {
										if(poltronaDisp[i]==true)
											System.out.println((i+1) + ", ");
									}
									do {
										System.out.println("Sua poltrona: ");
										resp2=r.nextInt()-1;
										if(poltronaDisp[resp2]==false)
											System.out.println("Esta poltrona já foi escolhida. Por favor, escolha outra.");
									}while(poltronaDisp[resp2]==false);
									System.out.println("Confirma? 1 - Sim / 2 - Não");
							 		if(r.nextInt()==1)
							 			SALA.get(aux).setPoltrona(resp2);
							 	case 5: 
							 		System.out.println("As alterações foram salvas. Fique a vontade para alterar novamente quando quiser.");
							}
						}while(resp!=5);
					}
				break;
				case 3:
					System.out.println("Excluir ingresso");
					System.out.println("Digite o código do ingresso que deseja excluir: ");
					aux=r.nextInt();
					flag=false;
					for(i=0;i<SALA.size();i++) {
						if(aux==SALA.get(i).getId())
							flag=true;
					}
					if(!flag)
						System.out.println("Não há ingresso disponível com esse código.");
					if(flag) {
						do {
							r.nextLine();
							System.out.println("Digite o CPF vinculado ao ingresso: ");
							resp3=r.nextLine();
							flag=false;
							for(i=0;i<SALA.size();i++) {
								if(resp3.equals(SALA.get(i).getCpfCliente()))
									flag=true;
							}
							if(!flag) {
								System.out.println("O CPF digitado não está vinculado ao ingresso. Pressione ENTER para continuar");
							}
							if(flag) {
								System.out.println("Dados do ingresso");
								System.out.println("CPF cadastrado: " + SALA.get(aux).getCpfCliente());
								System.out.println("Nome do filme: " + SALA.get(aux).getFilme());
								System.out.println("Tipo do ingresso: " + SALA.get(aux).verificarTipoIngresso(SALA.get(aux).getValorIngresso()));
								System.out.println("Valor do ingresso: " + SALA.get(aux).getValorIngresso());
								System.out.println("Poltrona: " + (SALA.get(aux).getPoltrona()+1));
								System.out.println("Deseja realmente excluir?(1 - SIM / 2 - NÃO): ");
								if(r.nextInt()==1) {
									poltronaDisp[aux]=true;
									SALA.remove(aux);
									System.out.println("Ingresso excluído com sucesso.");
								}else {
									System.out.println("Operação cancelada.");
								}
							}
						}while(!flag);
					}
			}		
		}while(op!=4);
		r.close();
	}
}