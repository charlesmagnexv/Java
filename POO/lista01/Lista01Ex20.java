/*
 * Lista01Ex20.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper
 * 
 * 20) Escreva um programa em Java para gerar uma matriz quadrada T de dimensão
	N. Imprimir os elementos da ampulheta.
 * 
 */


public class Lista01Ex20 {
	
	public static void main (String[] args) {
		int m1[][] = new int[7][7];
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
		System.out.println();
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				if(linha == coluna || linha + coluna == m1.length-1 || (linha+coluna <= m1.length-2 && coluna-linha >= 1) || (linha + coluna >= m1.length && linha - coluna >= 1)){
					System.out.print(m1[linha][coluna]+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}

