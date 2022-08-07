/*
 * Lista01Ex16.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper
 * 
 * 16) Escreva um programa em Java para gerar uma matriz quadrada P de dimensão
	N. Imprimir os elementos da abaixo da diagonal principal (inclusa) e
	abaixo da diagonal secundária (inclusa).
 * 
 * 
 */


public class Lista01Ex16 {
	
	public static void main (String[] args) {
		int m1[][] = new int[4][4];
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				m1[linha][coluna] = (int)(Math.random()*20);
			}
		}
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				System.out.print(m1[linha][coluna]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				if(linha==coluna || coluna <= linha-1){
					System.out.print(m1[linha][coluna]+"\t");
				}
				else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}

