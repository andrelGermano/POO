package dominio;

public class Edificio extends Imovel{
    private int totalDePortas;
    private int totalAndares;
    private Porta portas[];


    public int quantasPortasEstaoAbertas(){
        int cont=0;
        for(int i=0;i<portas.length;i++){
            if(portas[i].estaAberta())
                cont+=1;
        }
        return cont;
    }

    public void abrirPorta(int indice){
        portas[indice].abre();
    }

    public void fecharPorta(int indice){
        portas[indice].fecha();
    }

    public void adicionaPorta(Porta p){
        portas = new Porta[totalDePortas];
        for(int i=0;i<portas.length;i++){
            portas[i]=p;
        }
    }

    public int totalDePortas(){
        return totalDePortas;
    }

    public void setTotalDePortas(int tot){
        this.totalDePortas=tot;
    }

    public void adicionarAndar(){
        totalAndares+=1;
    }


    public int totalDeAndares(){
        return totalAndares;
    }

}
