/*
 * Candidato.java
 * 
 */


public class Candidato {
	private String nome;
	private int idade, vagaDesejada;
	public Candidato(){
		nome = "Juan";
		idade = 20;
		vagaDesejada = 0;
	}
	public void setNome( String nome ){
		this.nome = nome;
	}
	public void setIdade( int idade ){
		this.idade = idade;
	}
	public void setVagaDesejada( int vagaDesejada ){
		this.vagaDesejada = vagaDesejada;
	}
	public String hasNome(){
		return nome;
	}
	public int hasIdade(){
		return idade;
	}
	public int hasVagaDesejada(){
		return vagaDesejada;
	}
}

