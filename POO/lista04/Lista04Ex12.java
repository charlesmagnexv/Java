/*
 * Lista04Ex12.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 12) [POO-025] Crie um programa que solicite ao usuário um número inteiro. Utilizando métodos, exiba a 
	sequência dos números perfeito até o número informado.
	Entrada: 					Saída:
	Entre com um número: 10 	>> 6
	Entre com um número: 50 	>> 6 28
	Entre com um número: -4 	Erro! Valor inválido.
	Entre com um número: 0 		Erro! Valor inválido.
 * 
 * 
 */

import java.util.Scanner;
public class Lista04Ex12 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		System.out.print( "Entre com um numero: " );
		numero = leia.nextInt();
		System.out.println();
		if( numero <= 0 ){
			System.out.print( "Erro! Valor invalido" );
		}else{
			int vetorPerfeitos[] = perfeitos( numero );
			System.out.print( ">>\t" );
			for( int x = 0 ; x < vetorPerfeitos.length ; x ++ ){
				System.out.print( vetorPerfeitos[x] + "\t" );
			}
		}
	}
	static int[] perfeitos( int numero ){
		int contadorTamanhoVetor = 0, controlador = 0, contadorParaPerfeitos = 0;
		for( int num = 2 ; num <= numero ; num ++ ){
			contadorParaPerfeitos = 0;
			for( int multiplicador = num-1 ; multiplicador >= 1 ; multiplicador -- ){
				if( num % multiplicador == 0 ){
					contadorParaPerfeitos += multiplicador;
				}
			}
			if( contadorParaPerfeitos == num ){
				contadorTamanhoVetor ++;
			}
		}
		int vetorDePerfeitos[] = new int[contadorTamanhoVetor];
		for( int num = 2 ; num <= numero ; num ++ ){
			contadorParaPerfeitos = 0;
			for( int multiplicador = num -1 ; multiplicador >= 1 ; multiplicador -- ){
				if( num % multiplicador == 0 ){
					contadorParaPerfeitos += multiplicador;
				}
			}
			if( contadorParaPerfeitos == num ){
				vetorDePerfeitos[controlador] = num;
				controlador ++;
			}
		}
		return vetorDePerfeitos;
	}
}

