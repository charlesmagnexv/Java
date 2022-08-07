/*
 * Lista03Ex05.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 5) [POO-010] Crie um programa que solicite ao usuário três números inteiros. Através de um método, que 
 * receba esses 3 números como parâmetros de entrada, verifique e retorne o maior dos três valores.
	Restrição: USAR a técnica de sobrecarga para o método, um com 2 e outro com 3 parâmetros.
	Entrada: 									Saída:
	Entre com um número inteiro: 8 				O maior é: 8
	Entre com outro número inteiro: 2
	Entre com mais um número inteiro: 5
	Entre com um número inteiro: -48 			O maior é: 48
	Entre com outro número inteiro: 48
	Entre com mais um número inteiro: 1
	Entre com um número inteiro: 17 			O maior é: 17
	Entre com outro número inteiro: 17
	Entre com mais um número inteiro: 17
 * 
 * 
 */

import java.util.Scanner;
public class Lista03Ex05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int n1, n2, n3;
		System.out.print("Entre com um numero inteiro: \t");
		n1 = leia.nextInt();
		System.out.print("Entre com outro numero inteiro: \t");
		n2 = leia.nextInt();
		System.out.print("Entre com mais um numero inteiro: \t");
		n3 = leia.nextInt();
		System.out.print("O maior do metodo que recebe dois parametros: \t" + maior( n1, n2 ) );
		System.out.print("\nO maior do metodo que recebe tres parametros: \t" + maior( n1, n2, n3 ) );
	}
	static int maior( int n1, int n2 ){
		return Math.max( n1, n2 );
	}
	static int maior( int n1, int n2, int n3 ){
		int numeroMaior = Math.max( n1, n2 );
		return Math.max( numeroMaior, n3 );
	}
}

