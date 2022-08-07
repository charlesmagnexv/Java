public class Floresta {
    private String nome, especie;
    public Floresta(){
        nome = "";
        especie = "";
    }
    public void setNome( String nome ){
        this.nome = nome;
    }
    public void setEspecie( String especie ){
        this.especie = especie;
    }
    public String getNome(){
        return nome;
    }
    public String getEspecie(){
        return especie;
    }
}
