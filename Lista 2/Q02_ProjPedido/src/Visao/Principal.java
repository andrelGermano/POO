package Visao;

import java.util.ArrayList;
import Aplicacao.Pedido;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int op, cod=0, i, resp;
		boolean achou;
		Scanner r = new Scanner(System.in);
		ArrayList<Pedido> pedido = new ArrayList<Pedido>();
		
		do {
			System.out.println("----------- MENU -----------");
			System.out.println(" 1 - Fazer pedido"           );
			System.out.println(" 2 - Confirmar entrega"      );
			System.out.println(" 3 - Ver pedidos confirmados");
			System.out.println(" 4 - Ver pedidos entregues"  );
			System.out.println(" 5 - Sair"                   );
			System.out.println("----------------------------");
			do {
				System.out.println(" Opção: ");
				op = r.nextInt();
			}while(op<1||op>5);
			
			switch(op) {
				case 1: 
					Pedido a = new Pedido();
					do {
						
						a.setCodPed(cod);
						System.out.println("Hora da compra (escrever como o ex: 12,25): ");
						a.setHorario(r.nextFloat());
						System.out.println("Endereço de entrega: ");
						r.nextLine();
						a.setEndereco(r.nextLine());
						System.out.println("Horário: " + a.getHorario() + ", Endereço: " + a.getEndereco() + " (1-Confirmar/2-Alterar): ");
						resp=r.nextInt();
						
					}while(resp==2);
					
					System.out.println("Quantos botijões deseja comprar? (Preço: R$60,00): ");
					a.setBotijoes(r.nextInt());
					System.out.println("Insira o número do cartão de crédito: ");
					a.setFormaPag(r.nextDouble());
					a.setStatusPed("Confirmado");
					pedido.add(a);
					System.out.println("Código do pedido: " + pedido.get(cod).getCodPed());
					cod+=1;
					
				
				break;
				
				case 2:
					achou = false;
					System.out.println("Digite o código do pedido: ");
					resp=r.nextInt();
					for(i=0;i<pedido.size();i++) {
						if(resp==pedido.get(i).getCodPed()) {
							achou=true;
							pedido.get(i).setStatusPed("Entregue");
						}
					}
					if(!achou)
						System.out.println("Pedido não localizado.");
				break;
				
				case 3:
					achou=false;
					for(i=0;i<pedido.size();i++) {
						if(pedido.get(i).getStatusPed()=="Confirmado") {
							achou=true;
							System.out.println("----------------------------------");
							System.out.println("Código: " + pedido.get(i).getCodPed());
							System.out.println("Status: " + pedido.get(i).getStatusPed());
							System.out.println("Endereço: " + pedido.get(i).getEndereco());
							System.out.println("Horário: " + pedido.get(i).getHorario());
							System.out.println("Botijões: x" + pedido.get(i).getCodPed());
							System.out.println("Forma de pagamento: " + pedido.get(i).getFormaPag());
							System.out.println("Hora de entrega: " + pedido.get(i).getHoraEntrega());
							System.out.println("Total: " + pedido.get(i).getTotPedido() + "R$");
						}
					}
					if(!achou)
						System.out.println("Não há pedidos confirmados.");
				break;
				
				case 4:
					achou=false;
					for(i=0;i<pedido.size();i++) {
						if(pedido.get(i).getStatusPed()=="Entregue") {
							achou=true;
							System.out.println("----------------------------------");
							System.out.println("Código: " + pedido.get(i).getCodPed());
							System.out.println("Status: " + pedido.get(i).getStatusPed());
							System.out.println("Endereço: " + pedido.get(i).getEndereco());
							System.out.println("Horário: " + pedido.get(i).getHorario());
							System.out.println("Botijões: x" + pedido.get(i).getCodPed());
							System.out.println("Forma de pagamento: " + pedido.get(i).getFormaPag());
							System.out.println("Hora de entrega: " + pedido.get(i).getHoraEntrega());
							System.out.println("Total: " + pedido.get(i).getTotPedido() + "R$");
						}
					}
					if(!achou)
						System.out.println("Não há pedidos entregues.");
				break;
				
				case 5: 
					System.out.println("Saindo...");
				break;
				
				default:
					System.out.println("Código inválido");
			}
		}while(op!=5);
		
		r.close();
	}
	

}
