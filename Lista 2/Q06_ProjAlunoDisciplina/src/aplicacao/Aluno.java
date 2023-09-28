package aplicacao;

public class Aluno {
	private int matricula;
	private String nome;
	private float n1;
	private float n2;
	private float trab;
	private float media;
	private  float  qntFinal;
	
	public Aluno(int matricula, String nome, float n1, float n2,float trab) {
		this.matricula = matricula;
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.trab = trab;
	}
	private void setMedia(float n1, float n2, float trab) {
		media = (n1*2.5f) + (n2*2.5f) + trab*2 / 7;
	}
	private float qntFinal(float media) {
		setMedia(n1, n2, trab);
		if(media>=5)
			return 0;
		else
			return 7-media;
	}
	public String estado() {
		qntFinal(media);
		return ("Nome" + nome + "\nMatricula: " + matricula + "\nNota 1: " + n1 + "\nNota 2: " + n2 + "\nNota do trabalho: " + trab + "\nMédia: " + media + "\nQuanto precisa na final: " + qntFinal);
	}
	public String getNome() {
		return this.nome;
	}

	public float getMedia() {
		return this.media;
	}
	public int getMatricula() {
		return matricula;
	}
}
