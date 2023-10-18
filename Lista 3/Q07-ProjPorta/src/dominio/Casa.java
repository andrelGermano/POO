package dominio;

public class Casa extends Imovel{
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;


    public int quantasPortasEstaoAbertas(){
        int cont=0;
        if(porta1.estaAberta())
            cont+=1;
        if(porta2.estaAberta())
            cont+=1;
        if(porta3.estaAberta())
            cont+=1;
        return cont;
    }

    public int totalDePortas(){
        return 3;
    }


}
