package dominio;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEndereco(String endereco){
        this.endereco=endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setTelefone(String telefone){
        this.telefone=telefone;
    }

    public String getTelefone(){
        return telefone;
    }
}
/*Implemente a classe Principal para testar todos os métodos das classes anteriores (Pessoa e
Fornecedor). */