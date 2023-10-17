package aplicacao;

public class Voo extends Data{
    private int codigo;
    private boolean[] passageiros = new boolean[100];


    public Voo(int codigo, int dia, int mes, int ano){
        super(dia, mes, ano);
        this.codigo=codigo;
        for(int i=0;i<passageiros.length;i++){
            passageiros[i]=false;
        }
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public int proximoLivre(){
        int aux=0;
        for(int i=0;i<passageiros.length;i++){
            if(passageiros[i]==true) {
                aux = i;
                break;
            }
        }
        return aux;
    }

    public boolean verifica(int ocupada){
        if(passageiros[ocupada-1]==true)
            return true;
        else
            return false;
    }

    public boolean ocupa(int num){
        if(passageiros[num-1]==false) {
            passageiros[num-1] = true;
            return true;
        }
        else
            return false;
    }

    public int vagas(){
        int aux=0;
        for(int i=0;i<passageiros.length;i++){
            if(passageiros[i]==false)
                aux += 1;
        }
        return aux;
    }

    public int getVoo() {
        return this.codigo;
    }

    public Data getData(){
        return super.clone();
    }

    public Voo clone(){
        return new Voo(this.codigo, getDia(),getMes() ,getAno());
    }
}
