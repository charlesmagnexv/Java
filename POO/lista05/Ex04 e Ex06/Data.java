/*
 * Data.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 4) Criar uma classe para representar uma Data, onde teremos dia, mês e ano. 
 * Criar um método booleano que indicará se uma data inserida é válida ou não. 
 * Outro método necessário é o mostrar data.
 * 
 * 
 */


public class Data {
	private int dia, mes, ano;
	//private boolean validador;
	public Data(){
		//validador = true;
		dia = 1;
		mes = 1;
		ano = 2022;
	}
	public Data( int dia, int mes, int ano){
		//validador = true;
		setDia( dia );
		setMes( mes );
		setAno( ano );
	}
	public void setDia( int dia ){
		if( dia > 31 || dia < 0 ){
			throw new IllegalArgumentException( "Data Invalida" );//validador = false;
		}else{
			this.dia = dia;	
		}
	}
	public void setMes( int mes ){
		if( mes < 0 || mes > 12 ){
			throw new IllegalArgumentException( "Data Invalida" );//validador = false;
		}else{
			this.mes = mes;
		}
	}
	public void setAno( int ano ){
		this.ano = ano;
	}
	public int getDia(){
		return dia;
	}
	public int getMes(){
		return mes;
	}
	public int getAno(){
		return ano;
	}
	//public boolean validarData(){
		//return this.validador;
	//}
	public String exibirData(){
		return "Data: " + getDia() + " / " + getMes() + " / " + getAno();
	}
	@Override
	public String toString(){
		return "" + getDia() + " / " + getMes() + " / " + getAno();
	}
}

