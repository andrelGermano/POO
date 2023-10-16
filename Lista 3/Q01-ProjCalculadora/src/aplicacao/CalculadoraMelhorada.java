package aplicacao;

import java.lang.Math;

public class CalculadoraMelhorada extends Calculadora {
    private String memoria;

    public CalculadoraMelhorada() {
        super();
        this.memoria = "";
    }

    private double potencia() {
        return Math.pow(getOperando1(), getOperando2());
    }

    public double calcular() {
        double resultado = 0;
        if (getOperador() == '^') {
            resultado = potencia();
        } else {
            resultado = super.calcular();
        }
        memoria = String.valueOf(getOperando1()) + " " + getOperador() + " " + String.valueOf(getOperando2());
        return resultado;
    }

    public String verUltimaOperacao() {
        return memoria;
    }
}
/*Implemente a classe CalculadoraMelhorada, que herda os métodos de calculadora e implementa
um construtor, o atributo memoria (que guarda o nome da última operação realizada pela
calculadora), o método privado potência() e o método público verUltimaOperacao().
Sobrecarregue o método calcular para que a potência possa ser calculada.
Implemente, finalmente, a classe Principal que instancie uma Calculadora e uma
CalculadoraMelhorada e execute todas as suas funcionalidades a critério do usuário.*/
