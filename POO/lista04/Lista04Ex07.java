/*
 * Lista04Ex07.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 7) [POO-020] Crie um programa que solicite ao usuário dois números inteiros. Através de um método que 
	receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MDC (Máximo Divisor 
	Comum) destes números fornecidos. 
	Entrada: 					Saída: 					Cálculo:
	Entre com um valor: 10 		MDC: 10 						10, 20 | 2 [√]
	Entre com outro valor: 20 									5, 10 | 2 [x]
																5, 5 | 5 [√]
																1, 1 | 1 * 2 * 5 = 10
	Entre com um valor: 162 	MDC: 18 						162, 90 | 2 [√]
	Entre com outro valor: 90 									81, 45 | 3 [√]
																27, 15 | 3 [√]
																9, 5 | 3 [x]
																3, 5 | 3 [x]
																1, 5 | 5 [x]
																1, 1 | 1 * 2 * 3 * 3 = 18
	Entre com um valor: 23 		MDC: 1 							23, 21 | 3 [x]
	Entre com outro valor: 21 									23, 7 | 7 [x]
																23, 1 | 23 [x]
																1, 1 | 1 = 1

 * 
 * 
 */

import java.util.Scanner;
public class Lista04Ex07 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2;
		System.out.print( "Entre com um valor: " );
		n1 = leia.nextInt();
		System.out.print( "Entre com outro valor: " );
		n2 = leia.nextInt();
		System.out.println();
		System.out.print( "MDC: " + mdc( n1, n2 ) );
	}
	static int mdc( int n1, int n2 ){
		int primos[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int mdc = 1;
		for( int linha = 0 ; linha < primos.length ; linha ++ ){
			while( n1 % primos[linha] == 0 && n2 % primos[linha] == 0 ){
				mdc *= primos[linha];
				n1 = n1 / primos[linha];
				n2 = n2 / primos[linha];
			}
		}
		return mdc;
	}
}

