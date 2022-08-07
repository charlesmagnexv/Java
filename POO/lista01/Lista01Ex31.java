/*
 * Lista01Ex31.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper
 * 
 * 31) Escreva um programa em Java para gerar uma matriz (N x M). O usuário deve informar
	uma faixa de valores inteiros positivos (valor inicial e valor final). O programa
	deve gerar aleatoriamente os elementos da matriz, respeitando a faixa de valores fornecida
	pelo usuário. Ao final, imprimir a matriz resultante.
 * 
 */

import java.util.Scanner;
public class Lista01Ex31 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int valorFinal, valorInicial, numeroAleatorio;
		do{
			System.out.println();
			System.out.println("Digite o valor inicial: ");
			valorInicial = leia.nextInt();
			System.out.println("Digite o valor final: ");
			valorFinal = leia.nextInt();
			if( valorInicial > valorFinal ){
				System.out.println();
				System.out.println("O valor inicial nao pode ser maior do que o valor final!");
			}
			if( valorInicial <= 0 ){
				System.out.println();
				System.out.println("O valor inicial nao pode ser menor ou igual a 0!");
			}
			if( valorFinal <= 0 ){
				System.out.println();
				System.out.println("O valor final nao pode ser menor ou igual a 0!");
			}
		}while( valorInicial > valorFinal || valorInicial <= 0 || valorFinal <= 0 );
		int matriz[][] = new int[4][4];
		System.out.println("\nMatiz gerada: \n");
		for( int linha = 0 ; linha < matriz.length ; linha ++ ){
			for( int coluna = 0 ; coluna < matriz[linha].length ; coluna ++ ){
				do{
					numeroAleatorio = ( int )( ( Math.random()*valorFinal) + 1 );
				}while( numeroAleatorio < valorInicial || numeroAleatorio > valorFinal);
				matriz[linha][coluna] = numeroAleatorio;
				System.out.print(matriz[linha][coluna] + "\t");
			}
			System.out.println();
		}
	}
}

