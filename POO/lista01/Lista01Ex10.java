/*
 * Lista01Ex10.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 10) Escreva um programa em Java para gerar uma matriz quadrada H de dimensão
	N. Imprimir os elementos da diagonal secundária (linha + coluna =
	dimensão + 1).
 * 
 */


public class Lista01Ex10 {
	
	public static void main (String[] args) {
		int matriz[][] = new int[4][4];
		for(int linha = 0 ; linha < matriz.length ; linha++){
			for(int coluna = 0 ; coluna < matriz[linha].length ; coluna++){
				matriz[linha][coluna] = (int)(Math.random()*20);
			}
		}
		for(int linha = 0 ; linha < matriz.length ; linha++){
			for(int coluna = 0 ; coluna < matriz[linha].length ; coluna++){
				System.out.print(matriz[linha][coluna]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int linha = 0 ; linha < matriz.length ; linha++){
			for(int coluna = 0 ; coluna < matriz[linha].length ; coluna++){
				if(((linha+1)+(coluna+1))==(matriz.length+1)){
					System.out.print(matriz[linha][coluna]);
				}
			}
			System.out.println("\t");
		}
	}
}

