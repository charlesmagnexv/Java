/*
 * Calculadora.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 
 * 2) Crie uma classe para representar uma calculadora com as quatro operações básicas da aritmética
	conforme o diagrama abaixo e após uma classe que teste essa implementação.
 */


public class Calculadora {
	private int n1, n2;
	public Calculadora () {
		n1 = 1;
		n2 = 2;
	}
	public void setN1( int n1 ){
		this.n1 = n1;
	}
	public void setN2( int n2 ){
		this.n2 = n2;
	}
	public int getN1(){
		return n1;
	}
	public int getN2(){
		return n2;
	}
	public int somar(){
		return getN1() + getN2();
	}
	public int subtrair(){
		return getN1() - getN2();
	}
	public int multiplicar(){
		return getN1() * getN2();
	}
	public double dividir(){
		return (double)getN1() / (double)getN2();
	}
}

