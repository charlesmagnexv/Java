public class Carnivora extends Floresta{
	private boolean veneno;
	public Carnivora(){
		super();
		veneno = false;
	}
	public void setVeneno( boolean veneno ){
		this.veneno = veneno;
	}
	public boolean getVeneno(){
		return veneno;
	}
	
}

