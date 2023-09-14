package aplicacao;

public class pessoa {
	private String nome;
	private String telefone;
	private String email;
	private int codigo;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String estado() {
		return "Nome: " + nome +"\nTelefone: " + telefone + "\nEmail: " + email + "\nCódigo: " + codigo;
	}

}
