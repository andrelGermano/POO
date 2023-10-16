package visao;

import aplicacao.Calculadora;
import aplicacao.CalculadoraMelhorada;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculadora
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro operando: ");
        double operando1 = scanner.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        System.out.print("Digite o segundo operando: ");
        double operando2 = scanner.nextDouble();

        calculadora.setOperando1(operando1);
        calculadora.setOperando2(operando2);
        calculadora.setOperador(operador);
        double resultado1 = calculadora.calcular();
        System.out.println("Resultado da Calculadora: " + resultado1);

        // CalculadoraMelhorada
        CalculadoraMelhorada calculadoraMelhorada = new CalculadoraMelhorada();

        System.out.print("Digite o primeiro operando: ");
        operando1 = scanner.nextDouble();
        System.out.print("Digite o operador (^ para potência, +, -, *, /): ");
        operador = scanner.next().charAt(0);
        System.out.print("Digite o segundo operando: ");
        operando2 = scanner.nextDouble();

        calculadoraMelhorada.setOperando1(operando1);
        calculadoraMelhorada.setOperando2(operando2);
        calculadoraMelhorada.setOperador(operador);
        double resultado2 = calculadoraMelhorada.calcular();
        System.out.println("Resultado da Calculadora Melhorada: " + resultado2);

        String ultimaOperacao = calculadoraMelhorada.verUltimaOperacao();
        System.out.println("Última operação da Calculadora Melhorada: " + ultimaOperacao);

        scanner.close();
    }
}
