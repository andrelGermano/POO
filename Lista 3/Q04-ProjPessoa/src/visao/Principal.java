package visao;

import dominio.Fornecedor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nome, telefone, endereco;
        double credito, divida;

        Scanner r = new Scanner(System.in);
        Fornecedor f1 = new Fornecedor();

        System.out.print("Qual seu nome? ");
        f1.setNome(r.nextLine());
        System.out.print("Qual seu endereço? ");
        f1.setEndereco(r.nextLine());
        System.out.print("Qual seu telefone? ");
        f1.setTelefone(r.nextLine());
        System.out.print("Qual seu crédito? ");
        f1.setValorCredito(r.nextDouble());
        System.out.print("Qual sua dívida? ");
        f1.setValorDivida(r.nextDouble());

        System.out.println("\nSeus dados atuais: ");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Telefone: " + f1.getTelefone());
        System.out.println("Enedereco: " + f1.getEndereco());
        System.out.println("Crédito: " + f1.getValorCredito());
        System.out.println("Dívida: " + f1.getValorDivida());
        System.out.println("Saldo atual: " + f1.obterSaldo());


    }
}
