package aplicacao;

public class VooMarcado extends Voo{
    private int qtdCadeiras;
    private int qtdFumantes;
    private char[] fumantes;

    public VooMarcado(int cod,  int dia, int mes, int ano, int qtdCadeiras, int qtdFumantes){
        super(cod, dia, mes, ano, qtdCadeiras);
        this.qtdCadeiras=qtdCadeiras;
        this.qtdFumantes=qtdFumantes;
        cadeirasFumantes();
    }

    public int getQtdCadeiras(){
        return qtdCadeiras;
    }

    public int getQtdFumantes(){
        return qtdFumantes;
    }
    public void cadeirasFumantes(){
        fumantes = new char[qtdCadeiras];
        for(int i=fumantes.length-1;i>qtdCadeiras-qtdFumantes;i--){
            fumantes[i]='f';
        }
        for(int i=0;i<fumantes.length;i++){
            if(fumantes[i]!='f')
                fumantes[i]='n';
        }
    }

    public char tipo(int cadeira){
        char fn='a';
        if(fumantes[cadeira-1]=='f')
            fn='F';
        else
            fn='N';
        return fn;
    }
}
