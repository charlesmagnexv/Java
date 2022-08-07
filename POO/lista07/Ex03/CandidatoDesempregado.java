/*
 * CandidatoDesempregado.java
 
 */


public class CandidatoDesempregado extends Candidato {
	private int tempoDesemprego;
	public CandidatoDesempregado(){
		super();
		tempoDesemprego = 1;
	}
	public void setTempoDesemprego( int tempoDesemprego ){
		this.tempoDesemprego = tempoDesemprego;
	}
	public int getDesemprego(){
		return tempoDesemprego;
	}
}

