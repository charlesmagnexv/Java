public class Arvore extends Floresta{
    private boolean frutifera;
    public Arvore(){
        super();
        frutifera = true;
    }
    public void setFrutifera( boolean frutifera ){
        this.frutifera = frutifera;
    }
    public boolean getFrutifera(){
        return frutifera;
    }
}
