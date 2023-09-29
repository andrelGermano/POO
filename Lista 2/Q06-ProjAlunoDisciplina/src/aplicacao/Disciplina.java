package aplicacao;

import java.util.ArrayList;

public class Disciplina {
    private ArrayList<Aluno> aluno = new ArrayList<Aluno>();
    private int cod;
    private String titulo;
    private int cargaHoraria;
    private String nomeProfessor;

    public Disciplina(int cod) {
        this.cod=cod;
    }
    public String melhorAluno() {
        int i;
        float aux=0;
        String nomeAluno=null;
        for(i=0;i<aluno.size();i++) {
            if(aluno.get(i).getMedia()>aux) {
                aux=aluno.get(i).getMedia();
                nomeAluno = aluno.get(i).getNome();
            }
        }
        return nomeAluno;
    }
    public float media() {
        float media=0;
        for(int i=0;i<aluno.size();i++) {
            media+=aluno.get(i).getMedia();
        }
        media/=aluno.size();
        return media;
    }
    public void inserirDisciplina(String titulo, int cargaHoraria, String nomeProfessor) {
        this.titulo=titulo;
        this.cargaHoraria=cargaHoraria;
        this.nomeProfessor=nomeProfessor;
    }
    public void inserirAluno(Aluno a) {
        aluno.add(a);
    }
    public String consultarAluno(int matricula) {
        String info = null;
        for(int i=0; i < aluno.size();i++) {
            if(this.aluno.get(i).getMatricula() == matricula) {
                info = aluno.get(i).estado();
            }
        }
        return info;
    }
    public String getDados() {
        return "\nCodigo da disciplina: " + cod + "\nNome do professor: " + nomeProfessor + "\nTitulo: " + titulo + "\nCarga horária: " + cargaHoraria;
    }
    public void alterarProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    public int getcodDisciplina() {
        return cod;
    }
}
