/*
 * Estagio.java
 * 
 * 
 */


public class Estagio extends Vaga{
	private int tempo;
	public Estagio(){
		super();
		tempo = 6;
	}
	public void setTempo( int tempo ){
		this.tempo = tempo;
	}
	public int getTempo(){
		return tempo;
	}
}

