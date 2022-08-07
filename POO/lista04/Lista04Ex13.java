/*
 * Lista04Ex13.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 13) [POO-026] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que representará 
 * a quantidade de números inteiros que serão digitados em seguida e armazenados em um array. Através de um método que receba esse 
 * array de números inteiros como parâmetro de entrada. Este método deverá retornar, apenas, os números perfeitos existentes no conjunto recebido.
	Entrada: 									Saída:
	Entre com a quantidade de termos: 4 		>> 496 28
	Entre com 1º número: 31
	Entre com 2º número: 72
	Entre com 3º número: 496
	Entre com 4º número: 28
 
	Entre com a quantidade de termos: 3 		>> 6
	Entre com 1º número: 5
	Entre com 2º número: 6
	Entre com 3º número: 7
	
	Entre com a quantidade de termos: -5 		Erro! Valor inválido.
	
	Entre com a quantidade de termos: 0 		Erro! Valor inválido.
 * 
 * 
 */

import java.util.Scanner;
public class Lista04Ex13 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		int quantidade = (int)((Math.random()*10)+1);
		int vetorNumeros[] = new int[quantidade];
		for( int x = 0 ; x < vetorNumeros.length ; x ++ ){
			do{
				System.out.print( "Entre com o " + (x+1) + " numero: " );
				vetorNumeros[x] = leia.nextInt();
				if( vetorNumeros[x] <= 0 ){
					System.out.println("\nErro! Valor invalido.\n");
				}
			}while( vetorNumeros[x] <= 0 );
		}
		System.out.println();
		int vetorResultado[] = numerosPerfeitos( vetorNumeros );
		System.out.print( ">>\t" );
		for( int x = 0 ; x < vetorResultado.length ; x ++ ){
			System.out.print( vetorResultado[x] + "\t" );
		}
	}
	static int[] numerosPerfeitos( int[] vetorNumeros ){
		int resultadoPerfeitos = 0, contador = 0, contadorPerfeito = 0;
		for( int x = 0 ; x < vetorNumeros.length ; x ++ ){
			resultadoPerfeitos = 0;
			for( int y = 1 ; y <= (vetorNumeros[x]-1) ; y ++ ){
				if( vetorNumeros[x] % y == 0 ){
					resultadoPerfeitos += y;
				}
			}
			if( resultadoPerfeitos == vetorNumeros[x] ){
				contador ++;
			}
		}
		int vetorPerfeitos[] = new int[contador];
		for( int x = 0 ; x < vetorNumeros.length ; x ++ ){
			resultadoPerfeitos = 0;
			for( int y = 1 ; y <= ( vetorNumeros[x] - 1 ) ; y ++ ){
				if( vetorNumeros[x] % y == 0 ){
					resultadoPerfeitos += y;
				}
			}
			if( resultadoPerfeitos == vetorNumeros[x] ){
				vetorPerfeitos[contadorPerfeito] = vetorNumeros[x];
				contadorPerfeito ++;
			}
		}
		return vetorPerfeitos; 
	}
}

