package dominio;

public class Carro extends Veiculo implements Brinquedo{
    private String som;
    public void andarFrente() {
        passo+=3;
    }

    public void andarTras(){
        passo-=3;
    }

    public void ligarSom(){
        som = "Ligado";
    }
    public void desligarSom(){
        som = "Desligado";
    }
    public String frase(){
        return "Frase do carro";
    }
}
