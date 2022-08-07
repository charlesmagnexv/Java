/*
 * UsarCalculadora.java
 * 
 */

import java.util.Scanner;
public class UsarCalculadora {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Calculadora calc1 = new Calculadora();
		int resposta;
		System.out.print( "Digite um numero: " );
		calc1.setN1( leia.nextInt() );
		System.out.print( "Digite outro numero: " );
		calc1.setN2( leia.nextInt() );
		System.out.print( "1) Somar" );
		System.out.print( "\n2) Subtrair" );
		System.out.print( "\n3) Multiplicar" );
		System.out.print( "\n4) Dividir" );
		System.out.print( "\nEscolha uma opcao: " );
		resposta = leia.nextInt();
		if( resposta == 1 ){
			System.out.println( "Soma: " + calc1.somar() );
		}else if( resposta == 2 ){
			System.out.println( "Subtracao: " + calc1.subtrair() );
		}else if( resposta == 3 ){
			System.out.println( "Produto: " + calc1.multiplicar() );
		}else if( resposta == 4 ){
			System.out.println( "Divisao: " + calc1.dividir() );
		}else{
			System.out.println( "\n***ENTRADA INVALIDA!!***" );
		}
	}
}



