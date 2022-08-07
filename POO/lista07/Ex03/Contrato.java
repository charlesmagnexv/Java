/*
 * Contrato.java
 * 
 * 
 */


public class Contrato extends Vaga{
	private boolean temporario;
	public Contrato(){
		temporario = false;
	}
	public void setTemporario( boolean temporario ){
		this.temporario = temporario;
	}
	public boolean getTemporario(){
		return temporario;
	}
}

