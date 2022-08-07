/*
 * UsarEquacaoSegundoGrau.java
 * 
 * 
 */

import java.util.Scanner;
public class UsarEquacaoSegundoGrau {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		EquacaoSegundoGrau equa1 = new EquacaoSegundoGrau();
		double a, b, c;
		System.out.print( "Digite o valor de a: " );
		a = leia.nextInt();
		equa1.setA(a);
		System.out.print( "Digite o valor de b: " );
		b = leia.nextInt();
		equa1.setB(b);
		System.out.print( "Digite o valor de c: " );
		c = leia.nextInt();
		equa1.setC(c);
		System.out.println( "\n********** Raizes da equacao **********\n" );
		System.out.println( equa1.raizes() );
	}
}

