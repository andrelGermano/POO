package aplicacao;

public class Calculadora {
    private double operando1;
    private double operando2;
    private char operador;

    public Calculadora() {
        this.operando1 = 0;
        this.operando2 = 0;
        this.operador = '+';
    }

    private double soma() {
        return operando1 + operando2;
    }

    private double subtracao() {
        return operando1 - operando2;
    }

    private double multiplicacao() {
        return operando1 * operando2;
    }

    private double divisao() {
        if (operando2 != 0) {
            return operando1 / operando2;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
    }

    public double calcular() {
        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = soma();
                break;
            case '-':
                resultado = subtracao();
                break;
            case '*':
                resultado = multiplicacao();
                break;
            case '/':
                resultado = divisao();
                break;
        }
        return resultado;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public double getOperando1() {
        return operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public char getOperador() {
        return operador;
    }
}
