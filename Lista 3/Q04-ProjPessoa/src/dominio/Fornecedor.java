package dominio;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;


    public void setValorCredito(double credito){
        valorCredito=credito;
    }

    public double getValorCredito(){
        return valorCredito;
    }

    public void setValorDivida(double divida){
        valorDivida=divida;
    }

    public double getValorDivida(){
        return valorDivida;
    }

    public double obterSaldo(){
        return valorCredito-valorDivida;
    }


}
