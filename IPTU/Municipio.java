package sistema_iptu;

public class Municipio{
    private String nome;
    private String estado;
    private String precoM2;

    public Municipio (String nome, String estado, String precoM2){
        this.nome = nome
        this.estado = estado
        this.precoM2 = precoM2
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome
    }

    public String getEstado(){
        this.estado = estado;
    }

    public void setEstado(String estado){
        this.estao = estado;
    }

    public Double getPrecoM2(){
        return this.precoM2;
    }

    public void setPrecoM2(Double precoM2){
        this.precoM2 = precoM2;
    }
}