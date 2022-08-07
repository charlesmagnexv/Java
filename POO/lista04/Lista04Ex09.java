/*
 * Lista04Ex09.java
 * 
 * 9) [POO-022] Crie um programa que solicite ao usuário dois números inteiros. Através de um método que 
	receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MMC (Mínimo
	Múltiplo Comum) destes números fornecidos. Utilize decomposição simultânea ou fatoração simultânea.
	Entrada: 					Saída: 					Cálculo:
	Entre com um valor: 10 		MMC: 20 				10, 20 | 2
	Entre com outro valor: 20 							5, 10 | 2
														5, 5 | 5
														1, 1 | 2 * 2 * 5 = 20
	
	Entre com um valor: 162 	MMC: 810 				162, 90 | 2
	Entre com outro valor: 90 							81, 45 | 3
														27, 15 | 3
														9, 5 | 3
														3, 5 | 3
														1, 5 | 5
														1, 1 | 2 * 3 * 3 * 3 * 3 * 5 = 810
	
	Entre com um valor: 23 		MMC: 483 				23, 21 | 3
	Entre com outro valor: 21 							23, 7 | 7
														23, 1 | 23
														1, 1 | 3 * 7 * 23 = 483

 * 
 * 
 */

import java.util.Scanner;
public class Lista04Ex09 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2;
		System.out.print( "Entre com um valor: " );
		n1 = leia.nextInt();
		System.out.print( "Entre com outro valor: " );
		n2 = leia.nextInt();
		System.out.println();
		System.out.print( "MMC: " +mmc( n1, n2 ) );
	}
	static int mmc( int n1, int n2 ){
		int mmc = 1;
		for( int numero = 2 ; numero <= Math.max( n1, n2 ) ; numero ++ ){
			while( n1 % numero == 0 || n2 % numero ==0 ){
				if( n1 % numero == 0 && n2 % numero == 0 ){
					mmc *= numero;
					n1 /= numero;
					n2 /= numero;
				}else if( n1 % numero == 0 && n2 % numero != 0 ){
					mmc *= numero;
					n1 /= numero;
				}else if( n1 % numero != 0 && n2 % numero == 0 ){
					mmc *= numero;
					n2 /= numero;
				}
			}
			if( n1 == 1 && n2 == 1 ){
				break;
			}
		}
		return mmc;
	}
}

