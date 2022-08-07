/*
 * Lista04Ex06.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 6) [POO-019] Crie um programa que solicite ao usuário dois números inteiros. Estes, devem ser passados 
	como parâmetros de entrada para um método que irá gerar todos os números primos existentes no 
	intervalo fechado desses dois valores e retornar uma array com a resposta. O programa principal ficará com 
	a responsabilidade de imprimir o array de primos retornado pelo método. O método deve aceitar e 
	entender como sendo a mesma coisa passar, por exemplo, os valores 1 e 100 ou 100 e 1.
	Entrada: 						Saída:
	Entre com um valor: 10 			>> 11 13 17 19 23 29 31 37 41 43 47
	Entre com outro valor: 50
	Entre com um valor: 231 		>> 211 223 227 229
	Entre com outro valor: 205
	Entre com um valor: 19 			>> 19
	Entre com outro valor: 19

 * 
 * 
 */

import java.util.Scanner;
public class Lista04Ex06 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2;
		System.out.print( "Entre com um valor: " );
		n1 = leia.nextInt();
		System.out.print( "Entre com outro valor: " );
		n2 = leia.nextInt();
		int vetorPrimos[] = primos( n1, n2 );
		System.out.print( "\t>>\t" );
		for( int linha = 0 ; linha < vetorPrimos.length ; linha ++ ){
			System.out.print( vetorPrimos[linha] + "\t" );
		}
	}
	static int[] primos( int n1, int n2 ){
		int troca, contador = 0, quantidadeDePrimos = 0, contadorVetor = 0;
		if( n1 > n2 ){
			troca = n2;
			n2 = n1;
			n1 = troca;
		}
		for( int numero = n1 ; numero <= n2 ; numero ++ ){
			contador = 0;
			for( int primo = numero ; primo > 0 ; primo -- ){
				if( numero % primo == 0 ){
					contador ++;
				}
			}
			if( contador == 2 ){
				quantidadeDePrimos ++;
			}
		}
		int vetorDePrimos[] = new int[quantidadeDePrimos];
		for( int numero = n1 ; numero <= n2 ; numero ++ ){
			contador = 0;
			for( int primo = numero ; primo > 0 ; primo -- ){
				if( numero % primo == 0 ){
					contador ++;
				}
			}
			if( contador == 2 ){
				vetorDePrimos[contadorVetor] = numero;
				contadorVetor ++;
			}
		}
		return vetorDePrimos;
	}
}

