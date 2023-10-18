package aplicacao;

public class Voo extends Data{
    private int codigo;
    private boolean[] passageiros;
    private int lugares=100;

    public Voo(int codigo, int dia, int mes, int ano, int lugares){
        super(dia, mes, ano);
        this.codigo=codigo;
        passageiros = new boolean[lugares];
        for(int i=0;i<passageiros.length;i++){
            passageiros[i]=false;
        }
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public int proximoLivre() {
        int aux = -1;
        for (int i = 0; i < passageiros.length; i++) {
            if (!passageiros[i]) {
                aux = i;
                break;
            }
        }
        return aux;
    }

    public boolean verifica(int ocupada){
        if(passageiros[ocupada])
            return true;
        else
            return false;
    }

    public boolean ocupa(int num){
        if(!passageiros[num]) {
            passageiros[num] = true;
            return true;
        }
        else
            return false;
    }

    public int vagas(){
        int aux=0;
        for(int i=0;i<passageiros.length;i++){
            if(!passageiros[i])
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

    public int getLugares(){
        return lugares;
    }
    public Voo clone(){
        return new Voo(this.codigo, getDia(),getMes() ,getAno(), getLugares());
    }
}