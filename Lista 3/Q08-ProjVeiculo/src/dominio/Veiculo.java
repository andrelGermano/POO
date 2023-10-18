package dominio;

public abstract class Veiculo{
    protected int passo;
    private boolean ligado;
    private double velocidade;

    public int getPasso() {
        return passo;
    }

    public void ligar(){
        ligado=true;
    }

    public void desligar(){
        ligado=false;
    }

    public abstract void andarFrente();

    public abstract void andarTras();

    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }
}