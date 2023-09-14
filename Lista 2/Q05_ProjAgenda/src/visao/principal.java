package visao;

import java.util.ArrayList;
import java.util.Scanner;
import aplicacao.pessoa;

public class principal {

	public static void main(String[] args) {
		ArrayList<pessoa> Agenda = new ArrayList<pessoa>();
		Scanner r = new Scanner(System.in);
		
		int op, codAux=0, i, intAux, cod=0;
		String strAux;
		boolean flag;
		
		do {
			System.out.println("----------- MENU -----------" );
			System.out.println("1 - Cadastrar"                );
			System.out.println("2 - Excluir"                  );
			System.out.println("3 - Buscar"                   );
			System.out.println("4 - Informar dado específico" );
			System.out.println("5 - Listar contatos"          );
			System.out.println("6 - Sair"                     );
			System.out.println("----------------------------" );
			System.out.println("Opção: "                      );
			op=r.nextInt();
			r.nextLine();
			switch(op) {
				case 1: System.out.println("------ CADASTRO ------");
					pessoa a = new pessoa();
					a.setCodigo(cod);
					System.out.println("Nome: ");
					a.setNome(r.nextLine());
					System.out.println("Telefone: ");
					a.setTelefone(r.nextLine());
					System.out.println("Email: ");
					a.setEmail(r.nextLine());
					Agenda.add(a);
					System.out.println("Código do contato: " + a.getCodigo());
					System.out.println("Contato cadastrado com sucesso!");
					cod++;
				break;
				case 2: System.out.println("------ EXCLUIR ------");
					System.out.println("Qual telefone você deseja excluir? R: ");
					strAux = r.nextLine();
					flag = false;
					for(i=0;i<Agenda.size();i++) {
						if(strAux.equals(Agenda.get(i).getTelefone())) {
							flag=true;
							codAux=i;
						}
					}
					if(flag) {
						System.out.println(Agenda.get(codAux).estado() + "\nDeseja excluir o contato?(1 - SIM / 2 - NÃO): ");
						intAux=r.nextInt();
						if(intAux==1) {
							Agenda.remove(codAux);
							System.out.println("Contato excluído com sucesso!");
						}else
							System.out.println("Operação cancelada.");
					}else
						System.out.println("Este telefone não pertence a nenhum contato.");
				break;
				case 3: System.out.println("------ BUSCAR ------");
					System.out.println("Deseja buscar por 1 - Nome, 2 - Telefone, 3 - Email ou 4 - Código? R: ");
					intAux=r.nextInt();
					r.nextLine();
					switch(intAux) {
						case 1:
							System.out.println("Pesquisar nome: ");
							strAux=r.nextLine();
							flag=false;
							for(i=0;i<Agenda.size();i++) {
								if(strAux.equals(Agenda.get(i).getNome().toLowerCase())) {
									System.out.println("----------------------------");
									flag=true;
									System.out.println(Agenda.get(i).estado());
								}
								if(flag)
									System.out.println("----------------------------");
							}
							if(!flag)
								System.out.println("Nenhum resultado encontrado.");
						break;
						case 2:
							System.out.println("Pesquisar telefone: ");
							strAux=r.nextLine();
							flag=false;
							for(i=0;i<Agenda.size();i++) {
								if(strAux.equals(Agenda.get(i).getTelefone())) {
									System.out.println("----------------------------");
									flag=true;
									System.out.println(Agenda.get(i).estado());
								}
								if(flag)
									System.out.println("----------------------------");
							}
							if(!flag)
								System.out.println("Nenhum resultado encontrado.");
						break;
						case 3:
							System.out.println("Pesquisar email: ");
							strAux=r.nextLine();
							flag=false;
							for(i=0;i<Agenda.size();i++) {
								if(strAux.equals(Agenda.get(i).getEmail())) {
									System.out.println("----------------------------");
									flag=true;
									System.out.println(Agenda.get(i).estado());
								}
								if(flag)
									System.out.println("----------------------------");
							}
							if(!flag)
								System.out.println("Nenhum resultado encontrado.");
						break;
						case 4:
							System.out.println("Pesquisar Código: ");
							intAux=r.nextInt();
							flag=false;
							for(i=0;i<Agenda.size();i++) {
								if(intAux==Agenda.get(i).getCodigo()) {
									System.out.println("----------------------------");
									flag=true;
									System.out.println(Agenda.get(i).estado());
								}
								if(flag)
									System.out.println("----------------------------");
							}
							if(!flag)
								System.out.println("Nenhum resultado encontrado.");
					}
				break;
				case 4: System.out.println("----- INFORMAR DADOS -----");
					System.out.println("Digite o código do contato: ");
					codAux=r.nextInt();
					flag=false;
					for(i=0;i<Agenda.size();i++) {
						if(codAux==Agenda.get(i).getCodigo())
							flag=true;
					}
					if(!flag)
						System.out.println("Não existe contato com esse código.");
					else {
						System.out.println("Qual dado deseja saber?(1 - Nome, 2 - Telefone ou 3 - Email): ");
						intAux=r.nextInt();
						switch(intAux) {
							case 1:
							 System.out.println("Nome: " + Agenda.get(codAux).getNome());
							break;
							case 2:
								 System.out.println("Telefone: " + Agenda.get(codAux).getTelefone());
							break;
							case 3:
								 System.out.println("Email: " + Agenda.get(codAux).getEmail());
							break;
						}
					}
				break;
				case 5: System.out.println("----- LISTA DE CONTATOS -----");
				flag=false;
					for(i=0;i<Agenda.size();i++) {
						flag=true;
						System.out.println(Agenda.get(i).estado());
						System.out.println("-----------------------------");
					}
					if(!flag)
						System.out.println("Nenhum contato encontrado.");
				break;
				case 6:
					System.out.println("Fim de programa.");
				break;
				default:
					System.out.println("Código inválido.");
			}
		}while(op!=6);
	}
}
