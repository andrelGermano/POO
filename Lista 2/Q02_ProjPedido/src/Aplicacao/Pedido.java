package Aplicacao;

public class Pedido {
	private String enderecoPed;
	private float horarioPed;
	private int qtdBotijoes;
	private float totPedido;
	private float horaEntrega;
	private double formaPag;
	private String statusPed;
	private int codPedido;
	
	public void setEndereco(String novoEnd) {
		enderecoPed = novoEnd;
	}
	public String getEndereco() {
		return enderecoPed;
	}
	public void setHorario(float novoHorario) {
		horarioPed = novoHorario;
		calcularHoraEntrega(horarioPed);
	}
	public float getHorario() {
		return horarioPed;
	}
	public void setBotijoes(int qtdBotijoes) {
		this.qtdBotijoes = qtdBotijoes;
		calcularTotal(this.qtdBotijoes);
	}
	public int getQtdBotijoes() {
		return qtdBotijoes;
	}
	public void setTotPedido(float novoTotal) {
		totPedido = novoTotal;
	}
	public float getTotPedido() {
		return totPedido;
	}
	public void setHoraEntrega(float novaHora) {
		horaEntrega = novaHora;
	}
	public float getHoraEntrega() {
		return horaEntrega;
	}
	public void setFormaPag(double novoPag) {
		formaPag = novoPag;
	}
	public double getFormaPag() {
		return formaPag;
	}
	public void setStatusPed(String novoStatus) {
		statusPed = novoStatus;
	}
	public String getStatusPed() {
		return statusPed;
	}
	public void setCodPed(int novoCod) {
		codPedido = novoCod;
	}
	public int getCodPed() {
		return codPedido;
	}
	
	private void calcularTotal(int qtdBotijoes) {
		totPedido = qtdBotijoes * 60;
		setTotPedido(totPedido);
	}
	private void calcularHoraEntrega(float horarioPed) {
		if(horarioPed<18)
			horaEntrega=horarioPed+6;
		else
			horaEntrega=6-(24-horarioPed);
		
		setHoraEntrega(horaEntrega);
	}
}
