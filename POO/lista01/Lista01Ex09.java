/*
 * Lista01Ex09.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 9) Escreva um programa em Java para gerar uma matriz quadrada G de dimensão N.
Imprimir os elementos da diagonal principal (linha = coluna).
 * 
 * 
 */


public class Lista01Ex09 {
	
	public static void main (String[] args) {
		int matriz[][] = new int[4][4];
		for(int linha = 0 ; linha < matriz.length ; linha ++){
			for(int coluna = 0 ; coluna < matriz[linha].length ; coluna++){
				matriz[linha][coluna] = (int)(Math.random()*20);
			}
		}
		for(int linha = 0 ; linha <matriz.length ; linha++){
			for(int coluna = 0 ; coluna < matriz[linha].length ; coluna++){
				if(coluna == linha){
					System.out.print(matriz[linha][coluna]);
				}
			}
			System.out.println();
		}
	}
}

