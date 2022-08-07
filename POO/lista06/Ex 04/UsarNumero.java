/*
 * UsarNumero.java
 * 
 * 
 */

import java.util.Scanner;
public class UsarNumero {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Numero n1 = new Numero();
		System.out.print( "Digite um numero: " );
		n1.setNumero( leia.nextInt() );
		System.out.println( "Numero invertido: " + n1.inverter() );
	}
}

