/*
 * Vaga.java
 * 
 * 
 */


public class Vaga {
	private String descricao;
	private double salario;
	public Vaga(){
		descricao = "vaga para programador";
		double salario = 2000.00;
	}
	public void setDescricao( String descricao ){
		this.descricao = descricao;
	}
	public void setSalario( double salario ){
		this.salario = salario;
	}
	public String getDescricao(){
		return descricao;
	}
	public double getSalario(){
		return salario;
	}
}

