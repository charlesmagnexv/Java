/*
 * CandidatoEmpregado.java
 *
 * 
 */


public class CandidatoEmpregado extends Candidato{
	private String nomeEmpresa;
	public CandidatoEmpregado() {
		super();
		nomeEmpresa = "governo";
	}
	public void setNomeEmpresa( String nomeEmpresa ){
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getNomeEmpresa(){
		return nomeEmpresa;
	}
}

