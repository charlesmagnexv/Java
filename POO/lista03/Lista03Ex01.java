/*
 * Lista03Ex01.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 1) [POO-006] Crie um programa que solicite ao usuário dois números inteiros. Através de um método, 
 * que receba esses 2 números como parâmetros de entrada, verifique e retorne o maior dos dois valores.
	Restrição: NÃO usar o pacote Math.
	Entrada:                            Saída:
	Entre com um número inteiro: 8      O maior é: 8
	Entre com outro número inteiro: 2
	Entre com um número inteiro: -48    O maior é: 48
	Entre com outro número inteiro: 48
	Entre com um número inteiro: 17     O maior é: 17
	Entre com outro número inteiro: 17
 * 
 * 
 */

import java.util.Scanner;
public class Lista03Ex01 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b;
		System.out.println("Digite o valor de \"a\": ");
		a = leia.nextInt();
		System.out.println("Digite o valor de \"b\": ");
		b = leia.nextInt();
		System.out.println("\nO maior eh: " + maiorMenor( a, b ) );
	}
	static int maiorMenor( int a, int b ){
		if( a > b ){
			return a;
		}else{
			return b;
		}
	}
}

