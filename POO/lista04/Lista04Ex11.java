/*
 * Lista04Ex11.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 11) [POO-024] Crie um programa que solicite ao usuário um número inteiro. Através de um método que 
	receba esse número inteiro como parâmetro de entrada, verifique e retorne um valor boolean, que 
	indicará, caso true que ele é um número perfeito, caso false, que não é.
	Entrada: 							Saída:
	Entre com um número: 6 				O número 6 é perfeito
	Entre com um número: 11 			O número 11 não é perfeito
	Entre com um número: -4 			Erro! Valor inválido.
	Entre com um número: 0 				Erro! Valor inválido.
 * 
 * 
 */

import java.util.Scanner;
public class Lista04Ex11 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		System.out.print( "Entre com um numero: " );
		numero = leia.nextInt();
		System.out.println();
		if( numero <= 0 ){
			System.out.print( "Erro! Valor invalido" );
		}else{
			if( numeroPerfeito( numero ) ){
				System.out.print( "O numero " + numero + " eh perfeito" );
			}else{
				System.out.print( "O numero " + numero + " nao eh perfeito" );
			}
		}
	}
	static boolean numeroPerfeito( int numero ){
		boolean validacao = false;
		int contador = 0;
		for( int num = 2 ; num <= 10000 ; num ++ ){
			contador = 0;
			for( int perfeito = num-1 ; perfeito >= 1 ; perfeito -- ){
				if( num % perfeito == 0 ){
					contador += perfeito;
				}
			}
			if( contador == num ){
				if( num == numero ){
					validacao = true;
					break;
				}
			}
		}
		return validacao;
	}
}

