package Aplicacao;

public class ingresso {
	private String cpfCliente;
	private int id;
	private String filme;
	private int poltrona;
	private float valorIngresso;
	
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilme() {
		return filme;
	}
	public void setFilme(String filme) {
		this.filme = filme;
	}
	public int getPoltrona() {
		return poltrona;
	}
	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}
	public float getValorIngresso() {
		return valorIngresso;
	}
	public void setValorIngresso(int tipoIngresso) {
		if(tipoIngresso==2)
			valorIngresso = 8;
		else
			valorIngresso=16;
	}
	public String verificarTipoIngresso(float valorIngresso) {
		if(valorIngresso==16)
			return "Inteira";
		else
			return "Meia";
	}
	
}
