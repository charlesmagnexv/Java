/*
 * Lista01Ex02.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper
 * 
 * 2) Escreva um programa em Java para geral aleatoriamente os elementos
	(menor que 100) de uma matriz B de 6 linha por 3 colunas, imprimir a matriz
	gerada e imprimir a matriz em ordem invertida.
 *
 * 
 * 
 */

import java.util.Scanner;
public class Lista01Ex02 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int m1[][] = new int[6][3];
		for(int linha = 0; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				m1[linha][coluna] = (int)(Math.random()*100)+1;
			}
		}
		for(int linha = 0; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				System.out.print(m1[linha][coluna]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		for(int linha = m1.length-1 ; linha >= 0 ; linha--){
			for(int coluna = m1[linha].length-1 ; coluna >= 0 ; coluna--){
				System.out.print(m1[linha][coluna]+"\t");
			}
			System.out.println();
		}
	}
}

