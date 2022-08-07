/*
 * Lista01Ex29.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper
 * 
 * 29) Escreva um programa em Java para solicitar ao usuário um valor. Este valor lido
	será a quantidade de elementos de um vetor. Gerar os elementos do vetor. A partir do
	vetor gerado, criar uma matriz, onde a quantidade de linhas será igual à quantidade
	de elementos do vetor e as colunas serão os valores dos elementos do vetor mais um.
	Com a matriz criada, armazenar na primeira coluna de cada linha o respectivo elemento
	do vetor criado inicialmente e os demais elementos da linha serão formados
	pela sequencia de Primos. Imprimir a matriz resultante.
	Exemplo:
	Quantidade de elementos: 4
	Vetor gerado: 3, 5, 1, 6
	Matriz gerada: 3, 1, 2, 3
	5, 1, 2, 3, 5, 7
	1, 1
	6, 1, 2, 3, 5, 7, 11
 * 
 * 
 */

import java.util.Scanner;
public class Lista01Ex29 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int tamanho, primo, contador = 0, linhaVetor = 0;
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
		int vetorPrimos[] = new int[8];
		//gerar números primos para popular matriz
		for( int numero = 1 ; numero <= 20 ; numero ++ ){
			contador = 0;
			for( primo = numero ; primo >= 1 ; primo -- ){
				if( numero % primo == 0 ){
					contador++;
				}
			}
			if( contador == 2 ){
				vetorPrimos[linhaVetor] = numero;
				linhaVetor ++;
			}
		}
		for( int linha = 0 ; linha < matriz.length ; linha ++ ){
			linhaVetor = 0;
			for( int coluna = 0 ; coluna < matriz[linha].length ; coluna ++ ){
				if( coluna == 0 ){
					matriz[linha][coluna] = vetor[linha];
				}else{
					matriz[linha][coluna] = vetorPrimos[linhaVetor];
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

