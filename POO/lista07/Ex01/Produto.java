public class Produto {
    private double preco, quantidade = 0;
    public Produto(){
        preco = 1.0;
        quantidade = 1.0;
    }
    public void setPreco( double preco ){
        this.preco = preco;
    }
    public void setQuantidade( double quantidade ){
        this.quantidade = quantidade;
    }
    public double getPreco(){
        return preco;
    }
    public double getQuantidade(){
        return quantidade;
    }
}
