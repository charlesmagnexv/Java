/*
 * UsarAno.java
 * 
 */

import java.util.Scanner;
public class UsarAno {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Ano ano1 = new Ano();
		System.out.print( "Digite um ano: " );
		ano1.setAno( leia.nextInt() );
		if( ano1.ehBisexto() ){
			System.out.println( "O ano EH bisexto" );
		}else{
			System.out.println( "O ano NAO eh bisexto" );
		}
	}
}
