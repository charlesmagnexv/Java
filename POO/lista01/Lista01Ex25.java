/*
 * Lista01Ex25.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper
 * 
 * 25) Escreva um programa em Java para gerar uma matriz Y (N x M). Ordem os elementos
	da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.
 * 
 * 
 */


public class Lista01Ex25 {
	
	public static void main (String[] args) {
		int m1[][] = new int[4][4];
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				m1[linha][coluna] = (int)(Math.random()*20);
			}
		}
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				System.out.print(m1[linha][coluna] + "\t");
			}
			System.out.println();
		}
		for(int linha = 0 ; linha < m1.length ; linha ++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna ++){
				for(int linha2 = 0 ; linha2 < m1.length ; linha2 ++){
					for(int coluna2 = 0 ; coluna2 < m1[linha2].length ; coluna2 ++){
						if(m1[linha][coluna] < m1[linha2][coluna2]){
							int troca = m1[linha][coluna];
							m1[linha][coluna] = m1[linha2][coluna2];
							m1[linha2][coluna2] = troca;
						}
					}
				}
			}
		}
		System.out.println("\nMatriz em ordem crescente: ");
		for(int linha = 0 ; linha < m1.length ; linha ++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna ++){
				System.out.print(m1[linha][coluna]+"\t");
			}
			System.out.println();
		}
	}
}
