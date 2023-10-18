package dominio;

public class Caminhao extends Veiculo{

    public void andarFrente() {
        passo+=3;
    }

    public void andarTras(){
        passo-=3;
    }

}
