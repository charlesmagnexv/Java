/*
 * Ano.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 3) Elabore um programa em java que contenha um método booleano que teste se um ano 
 * é ou não bissexto. Anos divisíveis por 4 são bissextos, exceto para aqueles divisíveis 
 * por 100, ao menos que sejam também divisíveis por 400.
 * 
 * 
 */


public class Ano {
	private int ano;
	public Ano () {
		ano = 2022;
	}
	public void setAno( int ano ){
		if( ano <= 0 ){
			throw new IllegalArgumentException( "Ano invalido!" );
		}else{
			this.ano = ano;
		}
	}
	public int getAno(){
		return ano;
	}
	public boolean ehBisexto(){
		if( getAno() % 4 == 0 && getAno() % 100 != 0 ){
			return true;
		}else if( getAno() % 4 == 0 && getAno() % 100 == 0 && getAno() % 400 == 0 ){
			return true;
		}else{
			return false;
		}
	}
}

