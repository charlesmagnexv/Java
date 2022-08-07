/*
 * EquacaoSegundoGrau.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper;
 * 
 * 5) Criar uma classe para resolver a equação do segundo grau, sendo necessário passar 
 * os valores de a, b e c. Criar um método interno para o cálculo do delta e um público para 
 * mostrar o valor das raízes, ou da raiz ou ainda informar que não existem raízes reais. 
 * Lembre-se de validar para ver se é uma equação do segundo grau.
 * 
 * 
 */


public class EquacaoSegundoGrau {
	private double a, b, c;
	public EquacaoSegundoGrau () {
		a = 1;
		b = 1;
		c = 1;
	}
	public void setA( double a ) {
		this.a = a;
	}
	public void setB( double b ) {
		this.b = b;
	}
	public void setC( double C ) {
		this.c = c;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	private double delta( ){
		double delta, a, b, c;
		a = getA();
		b = getB();
		c = getC();
		delta = ( ( b*b ) - (4 * a * c ) );
		return delta;
	}
	public String raizes(){
		double raiz1, raiz2;
		if( delta() < 0 ){
			return "Nao existem raizes reais";
		}else{
			return "Raiz 1: " + ( ( ( -1* getB() ) + Math.sqrt(delta()) ) / ( 2 * getA() )  ) + " e Raiz 2: " + ( ( ( -1* getB() ) + Math.sqrt(delta()) ) / ( 2 * getA() )  );
		}
	}
}

