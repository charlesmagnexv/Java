/*
 * Lista01Ex30.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper
 * 
 * 30) Item ao exercício anterior, mas utilizando a sequencia de Fibonacci.
 * 
 * 
 */

import java.util.Scanner;
public class Lista01Ex30 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int tamanho, primo, contador = 0, linhaVetor = 0, fibonacci = 0, termo2 = 0, termo3 = 1;
		do{
			System.out.println("\nInforme o tamanho do vetor: ");
			tamanho = leia.nextInt();
			if(tamanho <= 0){
				System.out.println("\nKKKKK tamanho de um vetor tem de ser maior do que 0, doido!");
			}
		}while(tamanho <= 0);
		System.out.println("\nQuantidade de elementos: " + tamanho);
		int vetor[] = new int[tamanho];
		System.out.print("\nVetor gerado: \t");
		for(int linha = 0 ; linha < vetor.length ; linha ++){
			vetor[linha] = (int)((Math.random()*5)+1);
			System.out.print(vetor[linha] + "\t");
		}
		int matriz[][] = new int[tamanho][];
		for( int linha = 0 ; linha < matriz.length ; linha ++ ){
			matriz[linha] = new int[vetor[linha]+1];
		}
		System.out.println();
		int vetorFibonacci[] = new int[8];
		//gerar números primos para popular matriz
		vetorFibonacci[0] = 0;
		for( int i = 1 ; i <= 7 ; i ++ ){
			fibonacci = termo2 + termo3;
			termo3 = termo2;
			termo2 = fibonacci;
			vetorFibonacci[i] = fibonacci;
			fibonacci = 0;
		}
		for( int linha = 0 ; linha < matriz.length ; linha ++ ){
			linhaVetor = 0;
			for( int coluna = 0 ; coluna < matriz[linha].length ; coluna ++ ){
				if( coluna == 0 ){
					matriz[linha][coluna] = vetor[linha];
				}else{
					matriz[linha][coluna] = vetorFibonacci[linhaVetor];
					linhaVetor++;
				}
			}
		}
		System.out.println();
		for( int linha = 0 ; linha < matriz.length ; linha ++ ){
			for( int coluna = 0 ; coluna < matriz[linha].length ; coluna ++){
				System.out.print(matriz[linha][coluna] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}

