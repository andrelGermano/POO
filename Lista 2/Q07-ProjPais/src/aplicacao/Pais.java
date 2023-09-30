package aplicacao;

import java.util.ArrayList;

public class Pais {
    private String nome;
    private String capital;
    private double dimensao;
    ArrayList<Pais> fronteiras = new ArrayList<Pais>();

    public Pais(String nome, String capital,double dimensao){
        this.capital=capital;
        this.dimensao=dimensao;
        this.nome=nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean equals(Pais outro){
        return this.nome.equals(outro.getNome()) && this.capital.equals(outro.getCapital());
    }

    public void fronteiras(Pais pais){
        fronteiras.add(pais);
    }

    public ArrayList<Pais> fronteiras(){
        return fronteiras;
    }
    public ArrayList<Pais> getVizinhos(Pais pais){
        ArrayList<Pais> vizinhos = new ArrayList<Pais>();
        for(int i=0;i<fronteiras.size();i++){
            for(int j=0;i<fronteiras.size();j++){
                if(fronteiras.get(i).equals(this.fronteiras.get(j)))
                    vizinhos.add(fronteiras.get(j));
            }
        }
        return vizinhos;
    }
}
