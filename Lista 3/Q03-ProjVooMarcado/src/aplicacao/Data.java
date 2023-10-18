package aplicacao;

public class Data {
    private int dia, mes, ano;

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Data(int dia, int mes, int ano){
        boolean certo = true;
        if((mes<1||mes>12) || (dia<1||(mes==2&&dia>28)))
            certo = false;
        if(mes>7){
            if((mes%2==0&&dia<31)||(mes%2!=0&&dia<30))
                certo = false;
        }else if(mes<8){
            if((mes%2==0&&dia<30)||(mes%2!=0&&dia<31))
                certo = false;
        }
        if(!certo){
            this.dia = this.mes = this.ano = 1;
        }else{
            this.dia=dia;
            this.mes=mes;
            this.ano=ano;
        }
    }


    public int compara(Data data){
        if(this.ano==data.ano&&this.mes==data.mes&&this.dia==data.dia)
            return 0;
        else if(this.ano>data.ano||this.mes>data.mes||this.dia>data.dia)
            return 1;
        else
            return -1;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public String getMesExtenso() {
        String nomeMes="";
        if(mes==1)
            nomeMes = "Janeiro";
        else if(mes==2)
            nomeMes = "Fevereiro";
        else if(mes==3)
            nomeMes = "Março";
        else if(mes==4)
            nomeMes = "Abril";
        else if(mes==5)
            nomeMes = "Maio";
        else if(mes==6)
            nomeMes = "Junho";
        else if(mes==7)
            nomeMes = "Julho";
        else if(mes==8)
            nomeMes = "Agosto";
        else if(mes==9)
            nomeMes = "Setembro";
        else if(mes==10)
            nomeMes = "Outubro";
        else if(mes==11)
            nomeMes = "Novembro";
        else if(mes==12)
            nomeMes = "Dezembro";
        return nomeMes;
    }

    public Data clone(){
        return new Data(this.dia, this.mes, this.ano);
    }
}